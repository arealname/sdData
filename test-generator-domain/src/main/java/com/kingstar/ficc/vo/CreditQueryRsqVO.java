
package com.kingstar.ficc.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
* @comment 评级机构查询结果
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CreditQueryRsqVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* ID主键
	*/
	private String id;
	/**
	* 机构代码
	*/
	private String instCode;
	/**
	* 信用评级机构名称
	*/
	private String creditRatingAgency;
	/**
	* 信用评级（creditLevel）
	*/
	private String creditRating;
	/**
	* Rank值
	*/
	private Integer rankValue;
}