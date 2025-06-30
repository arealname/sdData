
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
* @comment 货币定义查询请求
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CurrencyQueryReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 主键ID
	*/
	@Length(max=32)
	private String curid;

	/**
	* 币种名称
	*/
	@Length(max=8)
	private String currency;

	/**
	* 国家
	*/
	@Length(max=300)
	private String country;
}