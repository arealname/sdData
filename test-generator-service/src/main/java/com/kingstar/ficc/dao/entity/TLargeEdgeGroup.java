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
* 大边组设定表
* </p>
*
* @author wenjie.cheng
* @since 2025-06-30
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("T_LARGE_EDGE_GROUP")
public class TLargeEdgeGroup extends Model<TLargeEdgeGroup> {

    private static final long serialVersionUID = 1L;

    /**
    * ID主键
    */
    @TableId("ID")
    private String id;

    /**
    * 大边组代码
    */
    @TableField("LARGE_EDGE_GROUP_ID")
    private String largeEdgeGroupId;

    /**
    * 大边组名称
    */
    @TableField("LARGE_EDGE_GROUP_NAME")
    private String largeEdgeGroupName;

    /**
    * 交易所代码 (0-上海证券交易所, 1-深圳证券交易所, 2-中国外汇交易中心, 3-北京证券交易所, 4-中国金融期货交易所, 5-上海黄金交易所, 6-上海期货交易所, 7-中央国债市场, 8-银行柜台, 9-场外交易市场, 10-其他交易所)
    */
    @TableField("EXCH_CODE")
    private String exchCode;

    /**
    * 交易所简称
    */
    @TableField("EXCH_NAME")
    private String exchName;

    /**
    * 合约代码
    */
    @TableField("CONTRACT_ID")
    private String contractId;

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


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
