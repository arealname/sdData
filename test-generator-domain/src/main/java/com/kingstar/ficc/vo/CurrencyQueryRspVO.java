
package com.kingstar.ficc.vo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
* @comment 货币定义查询响应
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class CurrencyQueryRspVO implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	* 主键ID
	*/
	private String curid;
	/**
	* 币种名称
	*/
	private String currency;
	/**
	* 国家
	*/
	private String country;
	/**
	* 描述
	*/
	private String remark;
	/**
	* 交易日历名称
	*/
	private String calendar;
	/**
	* 是否交易所日历 (1-是, 0-否)
	*/
	private String exchflag;
	/**
	* 交易所日历列表
	*/
	private List<ExchangeCaleVO> exchList;
}