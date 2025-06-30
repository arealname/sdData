package com.kingstar.ficc.enums;
import lombok.Getter;

/**
* @comment 会计类型 枚举类
* @author wenjie.cheng
*/
@Getter
public enum AccountingTypeEnum {

     FVTPL("200", "FVTPL账户"),
     AC("201", "AC账户"),
     OCI("202", "OCI账户");

    private final String value;
    private final String label;

    AccountingTypeEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据value获取枚举值
     * @param value
     * @return
     */
    public static AccountingTypeEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (AccountingTypeEnum enumValue : values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}