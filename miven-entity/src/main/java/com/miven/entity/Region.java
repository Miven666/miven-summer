package com.miven.entity;

/**
 * 地区
 * @author mingzhi.xie
 * @since 2020/7/27 1.0
 */
public enum Region {
    /**
     * 南方的
     */
    SOUTH,
    /**
     * 北方的
     */
    NORTH,
    ;

    public static Region fromText(String text) {
        for (Region value : values()) {
            if (value.name().equals(text)) {
                return value;
            }
        }
        throw new IllegalArgumentException("unknown enum value: " + text);
    }
}
