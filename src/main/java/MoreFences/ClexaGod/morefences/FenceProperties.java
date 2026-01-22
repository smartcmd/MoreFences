package MoreFences.ClexaGod.morefences;

import org.allaymc.api.block.property.type.BooleanPropertyType;

public final class FenceProperties {
    private FenceProperties() {}

    public static final BooleanPropertyType IN_WORLD = BooleanPropertyType.of("pa:in_world", true);
    public static final BooleanPropertyType NORTH = BooleanPropertyType.of("pa:north", false);
    public static final BooleanPropertyType SOUTH = BooleanPropertyType.of("pa:south", false);
    public static final BooleanPropertyType EAST = BooleanPropertyType.of("pa:east", false);
    public static final BooleanPropertyType WEST = BooleanPropertyType.of("pa:west", false);
}
