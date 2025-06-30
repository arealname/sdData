package com.kingstar.ficc.dao.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* <p>
* 席位表
* </p>
*
* @author wenjie.cheng
* @since 2025-06-30
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("T_SEAT")
public class TSeat extends Model<TSeat> {

    private static final long serialVersionUID = 1L;

    /**
    * 主键ID
    */
    @TableId("ID")
    private String id;

    /**
    * 交易所代码 (0-上海证券交易所, 1-深圳证券交易所, 2-中国外汇交易中心, 3-北京证券交易所, 4-中国金融期货交易所, 5-上海黄金交易所, 6-上海期货交易所, 7-中央国债市场, 8-银行柜台, 9-场外交易市场, 10-其他交易所)
    */
    @TableField("EXCH_CODE")
    private String exchCode;

    /**
    * 席位号
    */
    @TableField("SEAT_NO")
    private String seatNo;

    /**
    * 备注
    */
    @TableField("REMARK")
    private String remark;

    /**
    * 创建人
    */
    @TableField("CREATE_BY")
    private String createBy;

    /**
    * 创建时间
    */
    @TableField("CREATE_TIME")
    private BigDecimal createTime;

    /**
    * 更新时间
    */
    @TableField("UPDATE_TIME")
    private BigDecimal updateTime;

    /**
    * 更新人员
    */
    @TableField("UPDATE_BY")
    private String updateBy;

    /**
    * 版本号
    */
    @TableField("V_NUM")
    private Integer vNum;

    /**
    * 有效标志 (1-是, 0-否)
    */
    @TableField("VALID_FLAG")
    private String validFlag;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
