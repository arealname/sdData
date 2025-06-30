package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.LargeEdgeGroupFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * LargeEdgeGroup 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/LargeEdgeGroup")
public class LargeEdgeGroupController {

    @Autowired
    private LargeEdgeGroupFacade largeEdgeGroupFacade;


    /**
     * 大边组查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<LargeEdgeGroupQueryRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<LargeEdgeGroupQueryReqDTO> param
    ) {
        return CommonResponse.success(largeEdgeGroupFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 大边组新增
     */
    @PostMapping("/addLargeEdgeGroup")
    public CommonResponse<Boolean> addLargeEdgeGroup(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody LargeEdgeGroupAddReqDTO param
    ) {
        return CommonResponse.success(largeEdgeGroupFacade.addLargeEdgeGroup(operatorId, param));
    }

    /**
     * 大边组修改
     */
    @PostMapping("/updateData")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody LargeEdgeGroupAddReqDTO param
    ) {
        return CommonResponse.success(largeEdgeGroupFacade.updateData(operatorId, param));
    }

    /**
     * 大边组删除
     */
    @PostMapping("/deleteSubmit")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody LargeEdgeGroupDeleteReqDTO param
    ) {
        return CommonResponse.success(largeEdgeGroupFacade.deleteSubmit(operatorId, param));
    }
}