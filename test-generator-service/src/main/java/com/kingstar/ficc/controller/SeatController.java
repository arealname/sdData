package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.SeatFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * Seat 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/Seat")
public class SeatController {

    @Autowired
    private SeatFacade seatFacade;


    /**
     * 席位信息查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<SeatQueryRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<SeatQueryReqDTO> param
    ) {
        return CommonResponse.success(seatFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 席位信息新增
     */
    @PostMapping("/addSeat")
    public CommonResponse<Boolean> addSeat(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody SeatAddReqDTO param
    ) {
        return CommonResponse.success(seatFacade.addSeat(operatorId, param));
    }

    /**
     * 席位信息修改
     */
    @PostMapping("/updateData")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody SeatAddReqDTO param
    ) {
        return CommonResponse.success(seatFacade.updateData(operatorId, param));
    }

    /**
     * 席位信息删除
     */
    @PostMapping("/deleteSubmit")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody SeatQueryReqDTO param
    ) {
        return CommonResponse.success(seatFacade.deleteSubmit(operatorId, param));
    }
}