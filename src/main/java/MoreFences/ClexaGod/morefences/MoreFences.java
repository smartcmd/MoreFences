package MoreFences.ClexaGod.morefences;

import org.allaymc.api.block.type.BlockType;
import org.allaymc.api.item.ItemStack;
import org.allaymc.api.item.creative.CreativeItemCategory;
import org.allaymc.api.item.creative.CreativeItemGroup;
import org.allaymc.api.item.recipe.ShapedRecipe;
import org.allaymc.api.item.recipe.descriptor.ItemDescriptor;
import org.allaymc.api.item.recipe.descriptor.ItemTypeDescriptor;
import org.allaymc.api.plugin.Plugin;
import org.allaymc.api.registry.Registries;
import org.allaymc.api.utils.identifier.Identifier;
import org.allaymc.server.block.component.BlockStateDataComponentImpl;
import org.allaymc.server.block.type.AllayBlockType;
import org.allaymc.server.block.type.BlockStateDefinition;
import org.allaymc.server.block.type.BlockStateDefinition.MaterialInstance;
import org.allaymc.server.block.type.BlockStateDefinition.Materials;
import org.allaymc.server.block.type.CustomBlockDefinitionGenerator;
import org.cloudburstmc.nbt.NbtMap;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MoreFences extends Plugin {
    public static final String NAMESPACE = "ClexaGod";

    private static final String GEOMETRY_ID = "geometry.custom_fence";

    private static final Map<String, NbtMap> GEOMETRY_COMPONENT = Map.of(
            "minecraft:geometry",
            NbtMap.builder()
                    .putString("identifier", GEOMETRY_ID)
                    .putCompound("bone_visibility", NbtMap.builder()
                            .putString("pole", "q.block_state('pa:in_world')")
                            .putString("inventory", "!q.block_state('pa:in_world')")
                            .putString("east", "q.block_state('pa:east')")
                            .putString("north", "q.block_state('pa:north')")
                            .putString("west", "q.block_state('pa:west')")
                            .putString("south", "q.block_state('pa:south')")
                            .build())
                    .build()
    );

    private final Map<Identifier, BlockType<?>> fenceTypes = new LinkedHashMap<>();

    @Override
    public void onLoad() {
        pluginLogger.info("MoreFences is loading...");
        registerFenceTypes();
        pluginLogger.info("MoreFences loaded! Registered " + fenceTypes.size() + " fences.");
    }

    @Override
    public void onEnable() {
        pluginLogger.info("MoreFences is enabling...");
        registerCreativeItems();
        registerRecipes();
        pluginLogger.info("MoreFences enabled!");
    }

    @Override
    public void onDisable() {
        pluginLogger.info("MoreFences is disabled!");
    }

    private void registerFenceTypes() {
        for (var def : FenceDefinitions.ALL) {
            Identifier id = new Identifier(NAMESPACE, def.path());

            var definition = BlockStateDefinition.builder()
                    .geometry(GEOMETRY_ID)
                    .materials(Materials.builder()
                            .any(MaterialInstance.alphaTest(def.textureKey()))
                            .build())
                    .displayName(def.displayNameKey(NAMESPACE))
                    .build();

            BlockType<?> type = AllayBlockType.builder(FenceBlockBehavior.class)
                    .identifier(id)
                    .setProperties(
                            FenceProperties.IN_WORLD,
                            FenceProperties.NORTH,
                            FenceProperties.SOUTH,
                            FenceProperties.EAST,
                            FenceProperties.WEST
                    )
                    .addComponent(BlockStateDataComponentImpl.ofDirectDynamic(FenceStateData::fromState))
                    .blockDefinitionGenerator(CustomBlockDefinitionGenerator.of(state -> definition, GEOMETRY_COMPONENT))
                    .build();

            fenceTypes.put(id, type);
        }
    }

    private void registerCreativeItems() {
        if (fenceTypes.isEmpty()) {
            return;
        }

        CreativeItemCategory construction = Registries.CREATIVE_ITEMS.getConstructionCategory();
        CreativeItemGroup group = construction.getNamedGroup("itemGroup.name.fence");
        if (group == null) {
            ItemStack icon = fenceTypes.values().iterator().next().getItemType().createItemStack();
            group = construction.registerGroup("itemGroup.name.fence", icon);
        }

        for (var type : fenceTypes.values()) {
            group.registerItem(type.getItemType().createItemStack());
        }
    }

    private void registerRecipes() {
        for (var def : FenceRecipeDefinitions.ALL) {
            var recipeId = new Identifier(NAMESPACE, def.id());
            var outputType = Registries.ITEMS.get(new Identifier(def.resultId()));
            if (outputType == null) {
                pluginLogger.warn("Missing item type for recipe output: " + def.resultId());
                continue;
            }

            ItemStack output = outputType.createItemStack(def.count());

            Map<Character, ItemDescriptor> keys = new java.util.HashMap<>();
            boolean missingKey = false;
            for (var entry : def.keys().entrySet()) {
                var itemType = Registries.ITEMS.get(new Identifier(entry.getValue()));
                if (itemType == null) {
                    pluginLogger.warn("Missing item type for recipe key: " + entry.getValue());
                    missingKey = true;
                    break;
                }
                keys.put(entry.getKey(), new ItemTypeDescriptor(itemType));
            }

            if (missingKey) {
                continue;
            }

            char[][] pattern = ShapedRecipe.PatternHelper.build(def.pattern());
            var recipe = new ShapedRecipe(recipeId, new ItemStack[]{output}, 0, pattern, keys);
            Registries.RECIPES.register(recipeId, recipe);
        }
    }
}
