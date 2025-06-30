package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* Currency service接口层
* @author wenjie.cheng
*/
public interface CurrencyFacade {


    /**
    * 货币定义查询
    */
    IPage<CurrencyQueryRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            CurrencyQueryReqDTO param
    );

    /**
    * 货币定义新增
    */
    Boolean addCurrency(
            String operatorId,
            CurrencyAddReqDTO param
    );

    /**
    * 货币定义修改
    */
    Boolean updateData(
            String operatorId,
            CurrencyAddReqDTO param
    );

    /**
    * 货币定义删除
    */
    Boolean deleteSubmit(
            String operatorId,
            CurrencyQueryReqDTO param
    );
}