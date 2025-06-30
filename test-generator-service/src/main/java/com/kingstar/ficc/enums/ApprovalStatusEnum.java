package com.kingstar.ficc.enums;
import lombok.Getter;

/**
* @comment 审批状态 枚举类
* @author wenjie.cheng
*/
@Getter
public enum ApprovalStatusEnum {

     APPROVING("0", "审批中"),
     APPROVED("1", "审批通过"),
     UNAPPROVED("2", "审批不通过"),
     UNCOMMIT("3", "未提交");

    private final String value;
    private final String label;

    ApprovalStatusEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据value获取枚举值
     * @param value
     * @return
     */
    public static ApprovalStatusEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (ApprovalStatusEnum enumValue : values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}