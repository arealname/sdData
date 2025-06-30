package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* FundAccount service接口层
* @author wenjie.cheng
*/
public interface FundAccountFacade {


    /**
    * 资金账户查询
    */
    IPage<FundAccountRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            FundAccountReqDTO param
    );
}