package com.kingstar.ficc.enums;
import lombok.Getter;

/**
* @comment 标记 枚举类
* @author wenjie.cheng
*/
@Getter
public enum FlagEnum {

     TRUE("1", "是"),
     FALSE("0", "否");

    private final String value;
    private final String label;

    FlagEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据value获取枚举值
     * @param value
     * @return
     */
    public static FlagEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (FlagEnum enumValue : values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}