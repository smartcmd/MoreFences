package MoreFences.ClexaGod.morefences;

import org.allaymc.api.block.data.BlockFace;
import org.allaymc.api.block.dto.Block;
import org.allaymc.api.block.dto.PlayerInteractInfo;
import org.allaymc.api.block.type.BlockState;
import org.allaymc.server.block.impl.BlockFenceBehaviorImpl;
import org.allaymc.server.component.ComponentProvider;
import org.allaymc.api.component.Component;

import java.util.List;

public class FenceBlockBehavior extends BlockFenceBehaviorImpl {
    private static final BlockFace[] HORIZONTAL = {
            BlockFace.NORTH,
            BlockFace.SOUTH,
            BlockFace.WEST,
            BlockFace.EAST
    };

    public FenceBlockBehavior(List<ComponentProvider<? extends Component>> componentProviders) {
        super(componentProviders);
    }

    @Override
    public void afterPlaced(Block oldBlock, BlockState newBlockState, PlayerInteractInfo placementInfo) {
        super.afterPlaced(oldBlock, newBlockState, placementInfo);
        var placed = new Block(newBlockState, oldBlock.getPosition(), oldBlock.getLayer());
        updateFence(placed);
        updateAdjacentFences(placed);
    }

    @Override
    public void afterReplaced(Block oldBlock, BlockState newBlockState, PlayerInteractInfo placementInfo) {
        super.afterReplaced(oldBlock, newBlockState, placementInfo);
        if (isFence(oldBlock)) {
            updateAdjacentFences(oldBlock);
        }
    }

    @Override
    public void onNeighborUpdate(Block block, Block neighbor, BlockFace face) {
        super.onNeighborUpdate(block, neighbor, face);
        updateFence(block);
    }

    private void updateAdjacentFences(Block center) {
        for (var face : HORIZONTAL) {
            var neighbor = center.offsetPos(face);
            if (isFence(neighbor)) {
                updateFence(neighbor);
            }
        }
    }

    private void updateFence(Block block) {
        if (!isFence(block)) {
            return;
        }

        var state = block.getBlockState();
        boolean north = isConnectable(block.offsetPos(BlockFace.NORTH));
        boolean south = isConnectable(block.offsetPos(BlockFace.SOUTH));
        boolean west = isConnectable(block.offsetPos(BlockFace.WEST));
        boolean east = isConnectable(block.offsetPos(BlockFace.EAST));

        var updated = state
                .setPropertyValue(FenceProperties.IN_WORLD, true)
                .setPropertyValue(FenceProperties.NORTH, north)
                .setPropertyValue(FenceProperties.SOUTH, south)
                .setPropertyValue(FenceProperties.WEST, west)
                .setPropertyValue(FenceProperties.EAST, east);

        if (updated.blockStateHash() != state.blockStateHash()) {
            block.getPosition().dimension().setBlockState(block.getPosition(), updated);
        }
    }

    private boolean isConnectable(Block block) {
        return !block.isAir();
    }

    private boolean isFence(Block block) {
        return block.getBlockState().getBlockType().getBlockBehavior() instanceof FenceBlockBehavior;
    }
}
