
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
* @comment 信用评级
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CreditRankDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 信用评级（creditLevel）
	*/
	@Length(max=10)
	private String creditRating;

	/**
	* Rank值
	*/
	@Max(value = 99999999)
	private Integer rankValue;
}