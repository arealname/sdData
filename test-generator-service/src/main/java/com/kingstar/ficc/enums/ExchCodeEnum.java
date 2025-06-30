package com.kingstar.ficc.enums;
import lombok.Getter;

/**
* @comment 交易所代码 枚举类
* @author wenjie.cheng
*/
@Getter
public enum ExchCodeEnum {

     SSE("0", "上海证券交易所"),
     SZSE("1", "深圳证券交易所"),
     CFETS("2", "中国外汇交易中心"),
     BSE("3", "北京证券交易所"),
     CFFEX("4", "中国金融期货交易所"),
     SGE("5", "上海黄金交易所"),
     SHFE("6", "上海期货交易所"),
     CBM("7", "中央国债市场"),
     IBC("8", "银行柜台"),
     OTC("9", "场外交易市场"),
     OTHER("10", "其他交易所");

    private final String value;
    private final String label;

    ExchCodeEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据value获取枚举值
     * @param value
     * @return
     */
    public static ExchCodeEnum fromValue(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        for (ExchCodeEnum enumValue : values()) {
            if (enumValue.value.equals(value)) {
                return enumValue;
            }
        }
        return null;
    }
}