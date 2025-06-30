
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
* @comment 审批请求实体
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ApproveDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 唯一主键
	*/
	@Length(max=32)
	private String mainRef;

	/**
	* 操作类型 (0-新增, 1-修改, 2-删除, 3-查询)
	*/
	@Length(max=1)
	private String busType;

	/**
	* 业务主键
	*/
	@Length(max=300)
	private String busMainInfo;
}