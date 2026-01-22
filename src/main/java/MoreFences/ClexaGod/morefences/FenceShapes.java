package MoreFences.ClexaGod.morefences;

import org.allaymc.api.math.voxelshape.VoxelShape;

public final class FenceShapes {
    private FenceShapes() {}

    private static final double POST_MIN = 6.0 / 16.0;
    private static final double POST_MAX = 10.0 / 16.0;
    private static final double BAR_MIN = 7.0 / 16.0;
    private static final double BAR_MAX = 9.0 / 16.0;
    private static final double BAR_END = 6.0 / 16.0;
    private static final double BAR_START = 10.0 / 16.0;
    private static final double OUTLINE_MAX_Y = 1.0;
    private static final double COLLISION_MAX_Y = 24.0 / 16.0;

    public static VoxelShape shape(boolean north, boolean south, boolean west, boolean east) {
        return build(OUTLINE_MAX_Y, north, south, west, east);
    }

    public static VoxelShape collisionShape(boolean north, boolean south, boolean west, boolean east) {
        return build(COLLISION_MAX_Y, north, south, west, east);
    }

    private static VoxelShape build(double maxY, boolean north, boolean south, boolean west, boolean east) {
        var builder = VoxelShape.builder();

        // Center post
        builder.solid(POST_MIN, 0.0, POST_MIN, POST_MAX, maxY, POST_MAX);

        if (north) {
            builder.solid(BAR_MIN, 0.0, 0.0, BAR_MAX, maxY, BAR_END);
        }
        if (south) {
            builder.solid(BAR_MIN, 0.0, BAR_START, BAR_MAX, maxY, 1.0);
        }
        if (west) {
            builder.solid(0.0, 0.0, BAR_MIN, BAR_END, maxY, BAR_MAX);
        }
        if (east) {
            builder.solid(BAR_START, 0.0, BAR_MIN, 1.0, maxY, BAR_MAX);
        }

        return builder.build();
    }
}
