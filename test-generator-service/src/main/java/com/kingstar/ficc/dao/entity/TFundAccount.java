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
* 资金账户表
* </p>
*
* @author wenjie.cheng
* @since 2025-06-30
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("T_FUND_ACCOUNT")
public class TFundAccount extends Model<TFundAccount> {

    private static final long serialVersionUID = 1L;

    /**
    * 主键ID
    */
    @TableId("ID")
    private String id;

    /**
    * 资金账户号
    */
    @TableField("FUND_ACCOUNT_NO")
    private String fundAccountNo;

    /**
    * 账户类型 (01-综合结算备付金账户, 02-非担保结算备付金账户, 03-担保交收账户, 04-非担保交收账户, 05-结算保证金账户, 06-基金账户, 07-价差保证金账户)
    */
    @TableField("ACCOUNT_TYPE")
    private String accountType;

    /**
    * 账户属性 (0-内部, 1-外部)
    */
    @TableField("ACCOUNT_ATTR")
    private String accountAttr;

    /**
    * 证券账户号
    */
    @TableField("SECURITY_ACCOUNT_CODE")
    private String securityAccountCode;

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
