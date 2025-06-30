package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.CashFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * Cash 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/cash")
public class CashController {

    @Autowired
    private CashFacade cashFacade;


    /**
     * 资产账户查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<CashQueryRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<CashQueryReqDTO> param
    ) {
        return CommonResponse.success(cashFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 资产账户新增
     */
    @PostMapping("/create")
    public CommonResponse<Boolean> addCurrency(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CashAddReqDTO param
    ) {
        return CommonResponse.success(cashFacade.addCurrency(operatorId, param));
    }

    /**
     * 资产账户修改
     */
    @PostMapping("/update")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CashAddReqDTO param
    ) {
        return CommonResponse.success(cashFacade.updateData(operatorId, param));
    }

    /**
     * 资产账户删除
     */
    @PostMapping("/delete")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CashQueryReqDTO param
    ) {
        return CommonResponse.success(cashFacade.deleteSubmit(operatorId, param));
    }

    /**
     * 资产账户查询详细
     */
    @PostMapping("/queryDetailData")
    public CommonResponse<CashQueryDetailRspVO> queryDetailData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CashQueryReqDTO param
    ) {
        return CommonResponse.success(cashFacade.queryDetailData(operatorId, param));
    }

    /**
     * 资产账户设置审批通过回调
     */
    @PostMapping("/passApproval")
    public CommonResponse<Boolean> passApproval(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody ApproveDTO param
    ) {
        return CommonResponse.success(cashFacade.passApproval(operatorId, param));
    }

    /**
     * 资产账户设置审批拒绝回调
     */
    @PostMapping("/refuseApproval")
    public CommonResponse<Boolean> refuseApproval(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody ApproveDTO param
    ) {
        return CommonResponse.success(cashFacade.refuseApproval(operatorId, param));
    }
}