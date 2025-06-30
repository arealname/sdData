
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
* @comment 投组新增请求
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class PortfolioAddReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 投组ID
	*/
	@Length(max=32)
	private String portfolioId;

	/**
	* 投组名称
	*/
	@Length(max=300)
	private String portfolioName;

	/**
	* 资产单元
	*/
	@Length(max=64)
	private String cashUnitNameAbs;

	/**
	* 描述
	*/
	@Length(max=300)
	private String remark;
}