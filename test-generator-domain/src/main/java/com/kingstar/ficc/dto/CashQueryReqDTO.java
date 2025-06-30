
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
* @comment 资产账户查询
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CashQueryReqDTO implements Serializable {

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
}