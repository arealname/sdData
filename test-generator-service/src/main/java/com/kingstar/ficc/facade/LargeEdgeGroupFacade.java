package com.kingstar.ficc.facade;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
* LargeEdgeGroup service接口层
* @author wenjie.cheng
*/
public interface LargeEdgeGroupFacade {


    /**
    * 大边组查询
    */
    IPage<LargeEdgeGroupQueryRspVO> queryData(
            String operatorId,
            int pageNo,
            int pageSize,
            LargeEdgeGroupQueryReqDTO param
    );

    /**
    * 大边组新增
    */
    Boolean addLargeEdgeGroup(
            String operatorId,
            LargeEdgeGroupAddReqDTO param
    );

    /**
    * 大边组修改
    */
    Boolean updateData(
            String operatorId,
            LargeEdgeGroupAddReqDTO param
    );

    /**
    * 大边组删除
    */
    Boolean deleteSubmit(
            String operatorId,
            LargeEdgeGroupDeleteReqDTO param
    );
}