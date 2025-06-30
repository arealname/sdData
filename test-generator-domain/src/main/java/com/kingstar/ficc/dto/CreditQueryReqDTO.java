
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
* @comment 评级机构查询
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CreditQueryReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* ID主键
	*/
	@Length(max=32)
	private String id;

	/**
	* 机构代码
	*/
	@Length(max=32)
	private String instCode;

	/**
	* 信用评级机构名称
	*/
	@Length(max=64)
	private String creditRatingAgency;
}