package com.kingstar.ficc.enums;
import lombok.Getter;

/**
* @comment 操作类型 枚举类
* @author wenjie.cheng
*/
@Getter
public enum OperateTypeEnum {

     NEW("0", "新增"),
     UPDATE("1", "修改"),
     DELETE("2", "删除"),
     QUERY("3", "查询");

    private final String value;
    private final String label;

    OperateTypeEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据value获取枚举值
     * @param value
     * @return
     */
    public static OperateTypeEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (OperateTypeEnum enumValue : values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}