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
* 资产单元关系表
* </p>
*
* @author wenjie.cheng
* @since 2025-06-30
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("T_CASH_UNIT")
public class TCashUnit extends Model<TCashUnit> {

    private static final long serialVersionUID = 1L;

    /**
    * 主键ID
    */
    @TableId("ID")
    private String id;

    /**
    * 资产单元名称
    */
    @TableField("CASH_UNIT_NAME")
    private String cashUnitName;

    /**
    * 资产单元名称简称
    */
    @TableField("CASH_UNIT_NAME_ABS")
    private String cashUnitNameAbs;

    /**
    * 资产账户
    */
    @TableField("CASH_ACCOUNT_NAME")
    private String cashAccountName;

    /**
    * 资产账户ID
    */
    @TableField("CASH_ACCOUNT_ID")
    private String cashAccountId;

    /**
    * 描述
    */
    @TableField("CASH_UNIT_DESC")
    private String cashUnitDesc;

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

    /**
    * 审批状态-1：审批中、2：审批通过、3：审批拒绝 (0-审批中, 1-审批通过, 2-审批不通过, 3-未提交)
    */
    @TableField("APPROVAL_STATUS")
    private String approvalStatus;

    /**
    * 操作类型-0：查询、1：新增、2：修改、3：删除 (0-新增, 1-修改, 2-删除, 3-查询)
    */
    @TableField("OPT_TYPE")
    private String optType;

    /**
    * 审批关联主键ID
    */
    @TableField("APPROVAL_ID")
    private String approvalId;


    @Override
    public Serializable pkVal() {
        return this.id;
    }

}
