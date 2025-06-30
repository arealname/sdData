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
* 信用评级机构
* </p>
*
* @author wenjie.cheng
* @since 2025-06-30
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@TableName("T_CREDIT_RATING_AGENCY")
public class TCreditRatingAgency extends Model<TCreditRatingAgency> {

    private static final long serialVersionUID = 1L;

    /**
    * ID主键
    */
    @TableId("ID")
    private String id;

    /**
    * 机构代码
    */
    @TableField("INST_CODE")
    private String instCode;

    /**
    * 信用评级机构名称
    */
    @TableField("CREDIT_RATING_AGENCY")
    private String creditRatingAgency;

    /**
    * 信用评级（creditLevel）
    */
    @TableField("CREDIT_RATING")
    private String creditRating;

    /**
    * Rank值
    */
    @TableField("RANK_VALUE")
    private Integer rankValue;

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
