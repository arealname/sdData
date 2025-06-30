package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* Portfolio service接口层
* @author wenjie.cheng
*/
public interface PortfolioFacade {


    /**
    * 投组查询
    */
    IPage<PortfolioRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            PortfolioReqDTO param
    );

    /**
    * 投组新增
    */
    Boolean addPortfolio(
            String operatorId,
            PortfolioAddReqDTO param
    );

    /**
    * 投组修改
    */
    Boolean updateData(
            String operatorId,
            PortfolioAddReqDTO param
    );

    /**
    * 投组删除
    */
    Boolean deleteSubmit(
            String operatorId,
            PortfolioReqDTO param
    );

    /**
    * 投组查询详细
    */
    PortfolioRspVO queryDetailData(
            String operatorId,
            PortfolioDetailReqDTO param
    );

    /**
    * 投组设置审批通过回调
    */
    Boolean passApproval(
            String operatorId,
            ApproveDTO param
    );

    /**
    * 投组设置审批拒绝回调
    */
    Boolean refuseApproval(
            String operatorId,
            ApproveDTO param
    );
}