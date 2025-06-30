
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
* @comment 大额边际组新增请求
* @author wenjie.cheng
*/
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class LargeEdgeGroupAddReqDTO implements Serializable {

	private static final long serialVersionUID = 1L;


	/**
	* 大边组代码
	*/
	@Length(max=8)
	private String largeEdgeGroupId;

	/**
	* 大边组名称
	*/
	@Length(max=64)
	private String largeEdgeGroupName;

	/**
	* 交易所代码 (0-上海证券交易所, 1-深圳证券交易所, 2-中国外汇交易中心, 3-北京证券交易所, 4-中国金融期货交易所, 5-上海黄金交易所, 6-上海期货交易所, 7-中央国债市场, 8-银行柜台, 9-场外交易市场, 10-其他交易所)
	*/
	@Length(max=10)
	private String exchCode;

	/**
	* 交易所简称
	*/
	@Length(max=64)
	private String exchName;

	/**
	* 合约代码列表
	*/
    @Valid
	private List<String> contractIdList;
}