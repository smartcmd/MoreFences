package MoreFences.ClexaGod.morefences;

import org.allaymc.api.block.data.BlockStateData;
import org.allaymc.api.block.type.BlockState;

public final class FenceStateData {
    private FenceStateData() {}

    public static BlockStateData fromState(BlockState state) {
        boolean north = state.getPropertyValue(FenceProperties.NORTH);
        boolean south = state.getPropertyValue(FenceProperties.SOUTH);
        boolean west = state.getPropertyValue(FenceProperties.WEST);
        boolean east = state.getPropertyValue(FenceProperties.EAST);

        var shape = FenceShapes.shape(north, south, west, east);
        var collision = FenceShapes.collisionShape(north, south, west, east);

        return BlockStateData.builder()
                .collisionShape(collision)
                .shape(shape)
                .lightDampening(0)
                .lightEmission(0)
                .friction(0.4f)
                .hardness(1.0f)
                .explosionResistance(1.0f)
                .requiresCorrectToolForDrops(false)
                .isSolid(false)
                .build();
    }
}
