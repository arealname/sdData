
package com.kingstar.ficc.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
* @comment 资金账户响应
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class FundAccountRspVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 主键ID
	*/
	private String id;
	/**
	* 资金账户号
	*/
	private String fundAccountNo;
	/**
	* 账户类型 (01-综合结算备付金账户, 02-非担保结算备付金账户, 03-担保交收账户, 04-非担保交收账户, 05-结算保证金账户, 06-基金账户, 07-价差保证金账户)
	*/
	private String accountType;
	/**
	* 账户属性 (0-内部, 1-外部)
	*/
	private String accountAttr;
	/**
	* 证券账户号
	*/
	private String securityAccountCode;
	/**
	* 备注
	*/
	private String remark;
	/**
	* 创建人
	*/
	private String createBy;
	/**
	* 创建时间
	*/
	private Long createTime;
	/**
	* 更新时间
	*/
	private Long updateTime;
	/**
	* 更新人员
	*/
	private String updateBy;
	/**
	* 版本号
	*/
	private Integer vNum;
	/**
	* 有效标志 (1-是, 0-否)
	*/
	private String validFlag;
}