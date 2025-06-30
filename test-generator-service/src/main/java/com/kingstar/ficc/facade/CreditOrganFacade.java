package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* CreditOrgan service接口层
* @author wenjie.cheng
*/
public interface CreditOrganFacade {


    /**
    * 评级机构查询
    */
    IPage<CreditQueryRsqVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            CreditQueryReqDTO param
    );

    /**
    * 评级机构新增
    */
    Boolean addCreditOrgan(
            String operatorId,
            CreditRankAddReqDTO param
    );

    /**
    * 评级机构修改
    */
    Boolean updateData(
            String operatorId,
            CreditRankAddReqDTO param
    );

    /**
    * 评级机构删除
    */
    Boolean deleteSubmit(
            String operatorId,
            CreditQueryReqDTO param
    );
}