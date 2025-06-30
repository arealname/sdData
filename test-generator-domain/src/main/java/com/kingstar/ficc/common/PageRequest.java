package com.kingstar.ficc.common;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import java.io.Serializable;

@Data
public class PageRequest<T> implements Serializable {

	@Range(min=0,max=100,message = "每页目录数：0--100")
	private int pageSize;

	@Min(value = 0,message = "页码须大于0")
	private int pageNo ;

	private T data;

}