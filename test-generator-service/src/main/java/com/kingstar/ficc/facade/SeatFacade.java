package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* Seat service接口层
* @author wenjie.cheng
*/
public interface SeatFacade {


    /**
    * 席位信息查询
    */
    IPage<SeatQueryRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            SeatQueryReqDTO param
    );

    /**
    * 席位信息新增
    */
    Boolean addSeat(
            String operatorId,
            SeatAddReqDTO param
    );

    /**
    * 席位信息修改
    */
    Boolean updateData(
            String operatorId,
            SeatAddReqDTO param
    );

    /**
    * 席位信息删除
    */
    Boolean deleteSubmit(
            String operatorId,
            SeatQueryReqDTO param
    );
}