package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* Cash service接口层
* @author wenjie.cheng
*/
public interface CashFacade {


    /**
    * 资产账户查询
    */
    IPage<CashQueryRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            CashQueryReqDTO param
    );

    /**
    * 资产账户新增
    */
    Boolean addCurrency(
            String operatorId,
            CashAddReqDTO param
    );

    /**
    * 资产账户修改
    */
    Boolean updateData(
            String operatorId,
            CashAddReqDTO param
    );

    /**
    * 资产账户删除
    */
    Boolean deleteSubmit(
            String operatorId,
            CashQueryReqDTO param
    );

    /**
    * 资产账户查询详细
    */
    CashQueryDetailRspVO queryDetailData(
            String operatorId,
            CashQueryReqDTO param
    );

    /**
    * 资产账户设置审批通过回调
    */
    Boolean passApproval(
            String operatorId,
            ApproveDTO param
    );

    /**
    * 资产账户设置审批拒绝回调
    */
    Boolean refuseApproval(
            String operatorId,
            ApproveDTO param
    );
}