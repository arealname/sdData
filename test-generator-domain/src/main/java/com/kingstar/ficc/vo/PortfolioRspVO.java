
package com.kingstar.ficc.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
* @comment 投组查询响应
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class PortfolioRspVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 投组ID
	*/
	private String portfolioId;
	/**
	* 投组名称
	*/
	private String portfolioName;
	/**
	* 资产单元
	*/
	private String cashUnitNameAbs;
	/**
	* 描述
	*/
	private String remark;
	/**
	* 审批状态-1：审批中、2：审批通过、3：审批拒绝 (0-审批中, 1-审批通过, 2-审批不通过, 3-未提交)
	*/
	private String approvalStatus;
}