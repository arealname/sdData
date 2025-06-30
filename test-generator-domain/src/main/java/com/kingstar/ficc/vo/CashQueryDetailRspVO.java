
package com.kingstar.ficc.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
* @comment 资产账户查询详细响应
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CashQueryDetailRspVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 机构ID
	*/
	private String instId;
	/**
	* 机构名称
	*/
	private String instName;
	/**
	* 描述
	*/
	private String desc;
	/**
	* 审批状态-1：审批中、2：审批通过、3：审批拒绝 (0-审批中, 1-审批通过, 2-审批不通过, 3-未提交)
	*/
	private String approvalStatus;
	/**
	* 市场账户列表
	*/
	private List<MarketAccountVO> mAList;
}