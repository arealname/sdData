
package com.kingstar.ficc.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import org.hibernate.validator.constraints.Length;
import javax.validation.Valid;

import javax.validation.constraints.Max;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

/**
* @comment 资产账户新增请求
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CashAddReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 机构ID
	*/
	@Length(max=32)
	private String instId;

	/**
	* 机构名称
	*/
	@Length(max=64)
	private String instName;

	/**
	* 描述
	*/
	@Length(max=300)
	private String desc;

	/**
	* 审批状态-1：审批中、2：审批通过、3：审批拒绝 (0-审批中, 1-审批通过, 2-审批不通过, 3-未提交)
	*/
	@Length(max=1)
	private String approvalStatus;

	/**
	* 市场账户列表
	*/
    @Valid
	private List<MarketAccountDTO> mAList;
}