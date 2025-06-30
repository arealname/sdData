
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
* @comment 资金账户请求
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class FundAccountReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 主键ID
	*/
	@Length(max=32)
	private String id;

	/**
	* 资金账户号
	*/
	@Length(max=20)
	private String fundAccountNo;

	/**
	* 账户类型 (01-综合结算备付金账户, 02-非担保结算备付金账户, 03-担保交收账户, 04-非担保交收账户, 05-结算保证金账户, 06-基金账户, 07-价差保证金账户)
	*/
	@Length(max=10)
	private String accountType;

	/**
	* 账户属性 (0-内部, 1-外部)
	*/
	@Length(max=1)
	private String accountAttr;

	/**
	* 证券账户号
	*/
	@Length(max=32)
	private String securityAccountCode;

	/**
	* 备注
	*/
	@Length(max=300)
	private String remark;
}