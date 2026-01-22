package MoreFences.ClexaGod.morefences;

import java.util.List;

import java.util.Map;

public final class FenceRecipeDefinitions {
    private FenceRecipeDefinitions() {}
    public record FenceRecipeDefinition(String id, List<String> pattern, Map<Character, String> keys, String resultId, int count) {}
    public static final List<FenceRecipeDefinition> ALL = List.of(
        new FenceRecipeDefinition(
            "black_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:black_concrete", 'B', "minecraft:stick"),
            "ClexaGod:black_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "black_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:black_wool", 'B', "minecraft:stick"),
            "ClexaGod:black_wool",
            6
        ),
        new FenceRecipeDefinition(
            "blue_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:blue_concrete", 'B', "minecraft:stick"),
            "ClexaGod:blue_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "blue_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:blue_wool", 'B', "minecraft:stick"),
            "ClexaGod:blue_wool",
            6
        ),
        new FenceRecipeDefinition(
            "brown_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:brown_concrete", 'B', "minecraft:stick"),
            "ClexaGod:brown_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "brown_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:brown_wool", 'B', "minecraft:stick"),
            "ClexaGod:brown_wool",
            6
        ),
        new FenceRecipeDefinition(
            "cyan_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:cyan_concrete", 'B', "minecraft:stick"),
            "ClexaGod:cyan_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "cyan_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:cyan_wool", 'B', "minecraft:stick"),
            "ClexaGod:cyan_wool",
            6
        ),
        new FenceRecipeDefinition(
            "amethyst_fence_3107c20d",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:amethyst_block", 'B', "minecraft:stick"),
            "ClexaGod:amethyst_fence",
            6
        ),
        new FenceRecipeDefinition(
            "basalt_fence_bce6bc32",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:smooth_basalt", 'B', "minecraft:stick"),
            "ClexaGod:basalt_fence",
            6
        ),
        new FenceRecipeDefinition(
            "bedrock_fence_4ace2749",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:bedrock", 'B', "minecraft:stick"),
            "ClexaGod:bedrock_fence",
            9
        ),
        new FenceRecipeDefinition(
            "blackstone_fence_93c9a9fc",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:blackstone", 'B', "minecraft:stick"),
            "ClexaGod:blackstone_fence",
            6
        ),
        new FenceRecipeDefinition(
            "brick_fence_3706f792",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:brick", 'B', "minecraft:stick"),
            "ClexaGod:brick_fence",
            3
        ),
        new FenceRecipeDefinition(
            "calcite_fence_800cb500",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:calcite", 'B', "minecraft:stick"),
            "ClexaGod:calcite_fence",
            6
        ),
        new FenceRecipeDefinition(
            "coal_fence_072d78d3",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:coal", 'B', "minecraft:stick"),
            "ClexaGod:coal_fence",
            2
        ),
        new FenceRecipeDefinition(
            "cobbled_deepslate_fence_771444f7",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:cobbled_deepslate", 'B', "minecraft:stick"),
            "ClexaGod:cobbled_deepslate_fence",
            6
        ),
        new FenceRecipeDefinition(
            "cobblestone_fence_65a875d4",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:cobblestone", 'B', "minecraft:stick"),
            "ClexaGod:cobblestone_fence",
            6
        ),
        new FenceRecipeDefinition(
            "crying_obsidian_fence_4ebb3c24",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:crying_obsidian", 'B', "minecraft:stick"),
            "ClexaGod:crying_obsidian_fence",
            6
        ),
        new FenceRecipeDefinition(
            "diamond_fence_abf871a7",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:diamond", 'B', "minecraft:stick"),
            "ClexaGod:diamond_fence",
            6
        ),
        new FenceRecipeDefinition(
            "dirt_fence_cdf3946f",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:dirt", 'B', "minecraft:stick"),
            "ClexaGod:dirt_fence",
            1
        ),
        new FenceRecipeDefinition(
            "dripstone_fence_90d640f6",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:dripstone_block", 'B', "minecraft:stick"),
            "ClexaGod:dripstone_fence",
            6
        ),
        new FenceRecipeDefinition(
            "emerald_fence_e60e2a80",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:emerald", 'B', "minecraft:stick"),
            "ClexaGod:emerald_fence",
            6
        ),
        new FenceRecipeDefinition(
            "endstone_fence_2a0018f4",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:end_stone", 'B', "minecraft:stick"),
            "ClexaGod:endstone_fence",
            6
        ),
        new FenceRecipeDefinition(
            "glowstone_fence_9ca8ea23",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:glowstone_dust", 'B', "minecraft:stick"),
            "ClexaGod:glowstone_fence",
            1
        ),
        new FenceRecipeDefinition(
            "gold_fence_fe9eb4ea",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:gold_ingot", 'B', "minecraft:stick"),
            "ClexaGod:gold_fence",
            6
        ),
        new FenceRecipeDefinition(
            "green_bamboo_fence_529acff2",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:bamboo_block", 'B', "minecraft:stick"),
            "ClexaGod:green_bamboo_fence",
            6
        ),
        new FenceRecipeDefinition(
            "ice_fence_dc376313",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:packed_ice", 'B', "minecraft:stick"),
            "ClexaGod:ice_fence",
            6
        ),
        new FenceRecipeDefinition(
            "iron_fence_76bf4d54",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:iron_ingot", 'B', "minecraft:stick"),
            "ClexaGod:iron_fence",
            6
        ),
        new FenceRecipeDefinition(
            "lapis_lazuli_fenceby78_625697e9",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:lapis_lazuli", 'B', "minecraft:stick"),
            "ClexaGod:lapis_lazuli_fenceby78",
            6
        ),
        new FenceRecipeDefinition(
            "moss_fence_6ccf375c",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:moss_block", 'B', "minecraft:stick"),
            "ClexaGod:moss_fence",
            6
        ),
        new FenceRecipeDefinition(
            "mud_fence_5327ec6e",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:packed_mud", 'B', "minecraft:stick"),
            "ClexaGod:mud_fence",
            6
        ),
        new FenceRecipeDefinition(
            "muddy_fence_6aa5cc46",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:mud", 'B', "minecraft:stick"),
            "ClexaGod:muddy_fence",
            6
        ),
        new FenceRecipeDefinition(
            "netherite_fence_215d231d",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:netherite_ingot", 'B', "minecraft:stick"),
            "ClexaGod:netherite_fence",
            6
        ),
        new FenceRecipeDefinition(
            "netherrack_fence_099a1ed1",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:netherrack", 'B', "minecraft:stick"),
            "ClexaGod:netherrack_fence",
            3
        ),
        new FenceRecipeDefinition(
            "obsidian_fence_da6d7606",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:obsidian", 'B', "minecraft:stick"),
            "ClexaGod:obsidian_fence",
            6
        ),
        new FenceRecipeDefinition(
            "ochre_froglight_fence_f33bd642",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:ochre_froglight", 'B', "minecraft:stick"),
            "ClexaGod:ochre_froglight_fence",
            6
        ),
        new FenceRecipeDefinition(
            "pearlescent_froglight_fence_67953c7f",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:pearlescent_froglight", 'B', "minecraft:stick"),
            "ClexaGod:pearlescent_froglight_fence",
            6
        ),
        new FenceRecipeDefinition(
            "prismarine_fence_9bcc82c6",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:prismarine", 'B', "minecraft:stick"),
            "ClexaGod:prismarine_fence",
            6
        ),
        new FenceRecipeDefinition(
            "quartz_fence_98095139",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:quartz", 'B', "minecraft:stick"),
            "ClexaGod:quartz_fence",
            2
        ),
        new FenceRecipeDefinition(
            "raw_copper_block_fence_6a429e07",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:raw_copper_block", 'B', "minecraft:stick"),
            "ClexaGod:raw_copper_block_fence",
            6
        ),
        new FenceRecipeDefinition(
            "raw_gold_block_fence_4478747a",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:raw_gold_block", 'B', "minecraft:stick"),
            "ClexaGod:raw_gold_block_fence",
            6
        ),
        new FenceRecipeDefinition(
            "raw_iron_block_fence_e33f7a64",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:raw_iron_block", 'B', "minecraft:stick"),
            "ClexaGod:raw_iron_block_fence",
            6
        ),
        new FenceRecipeDefinition(
            "basaresinfrnce_fence_bce6bc32",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:resin_block", 'B', "minecraft:stick"),
            "ClexaGod:resin_fence",
            6
        ),
        new FenceRecipeDefinition(
            "sandstone_fence_ede6508b",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:sandstone", 'B', "minecraft:stick"),
            "ClexaGod:sandstone_fence",
            6
        ),
        new FenceRecipeDefinition(
            "sculk_fence_56b4e474",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:sculk", 'B', "minecraft:stick"),
            "ClexaGod:sculk_fence",
            6
        ),
        new FenceRecipeDefinition(
            "shroomlight_fence_7dac8def",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:shroomlight", 'B', "minecraft:stick"),
            "ClexaGod:shroomlight_fence",
            6
        ),
        new FenceRecipeDefinition(
            "snow_fence_0dcabe51",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:snowball", 'B', "minecraft:stick"),
            "ClexaGod:snow_fence",
            3
        ),
        new FenceRecipeDefinition(
            "soul_soil_fence_3b32f68c",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:soul_soil", 'B', "minecraft:stick"),
            "ClexaGod:soul_soil_fence",
            6
        ),
        new FenceRecipeDefinition(
            "stonebrick_fence_0b4232bc",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:stonebrick", 'B', "minecraft:stick"),
            "ClexaGod:stonebrick_fence",
            6
        ),
        new FenceRecipeDefinition(
            "tuff_fence_de241fd4",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:tuff", 'B', "minecraft:stick"),
            "ClexaGod:tuff_fence",
            6
        ),
        new FenceRecipeDefinition(
            "verdant_froglight_fence_c35a28e9",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:verdant_froglight", 'B', "minecraft:stick"),
            "ClexaGod:verdant_froglight_fence",
            6
        ),
        new FenceRecipeDefinition(
            "gray_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:gray_concrete", 'B', "minecraft:stick"),
            "ClexaGod:gray_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "gray_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:gray_wool", 'B', "minecraft:stick"),
            "ClexaGod:gray_wool",
            6
        ),
        new FenceRecipeDefinition(
            "green_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:green_concrete", 'B', "minecraft:stick"),
            "ClexaGod:green_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "green_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:green_wool", 'B', "minecraft:stick"),
            "ClexaGod:green_wool",
            6
        ),
        new FenceRecipeDefinition(
            "light_blue_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:light_blue_concrete", 'B', "minecraft:stick"),
            "ClexaGod:light_blue_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "light_blue_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:light_blue_wool", 'B', "minecraft:stick"),
            "ClexaGod:light_blue_wool",
            6
        ),
        new FenceRecipeDefinition(
            "light_gray_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:light_gray_concrete", 'B', "minecraft:stick"),
            "ClexaGod:light_gray_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "light_gray_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:light_gray_wool", 'B', "minecraft:stick"),
            "ClexaGod:light_gray_wool",
            6
        ),
        new FenceRecipeDefinition(
            "lime_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:lime_concrete", 'B', "minecraft:stick"),
            "ClexaGod:lime_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "lime_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:lime_wool", 'B', "minecraft:stick"),
            "ClexaGod:lime_wool",
            6
        ),
        new FenceRecipeDefinition(
            "magenta_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:magenta_concrete", 'B', "minecraft:stick"),
            "ClexaGod:magenta_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "magenta_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:magenta_wool", 'B', "minecraft:stick"),
            "ClexaGod:magenta_wool",
            6
        ),
        new FenceRecipeDefinition(
            "orange_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:orange_concrete", 'B', "minecraft:stick"),
            "ClexaGod:orange_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "orange_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:orange_wool", 'B', "minecraft:stick"),
            "ClexaGod:orange_wool",
            6
        ),
        new FenceRecipeDefinition(
            "pink_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:pink_concrete", 'B', "minecraft:stick"),
            "ClexaGod:pink_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "pink_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:pink_wool", 'B', "minecraft:stick"),
            "ClexaGod:pink_wool",
            6
        ),
        new FenceRecipeDefinition(
            "purple_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:purple_concrete", 'B', "minecraft:stick"),
            "ClexaGod:purple_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "purple_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:purple_wool", 'B', "minecraft:stick"),
            "ClexaGod:purple_wool",
            6
        ),
        new FenceRecipeDefinition(
            "red_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:red_concrete", 'B', "minecraft:stick"),
            "ClexaGod:red_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "red_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:red_wool", 'B', "minecraft:stick"),
            "ClexaGod:red_wool",
            6
        ),
        new FenceRecipeDefinition(
            "white_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:white_concrete", 'B', "minecraft:stick"),
            "ClexaGod:white_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "white_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:white_wool", 'B', "minecraft:stick"),
            "ClexaGod:white_wool",
            6
        ),
        new FenceRecipeDefinition(
            "yellow_concrete_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:yellow_concrete", 'B', "minecraft:stick"),
            "ClexaGod:yellow_concrete",
            6
        ),
        new FenceRecipeDefinition(
            "yellow_wool_recipe",
            List.of("ABA", "ABA"),
            Map.of('A', "minecraft:yellow_wool", 'B', "minecraft:stick"),
            "ClexaGod:yellow_wool",
            6
        )
    );
}
