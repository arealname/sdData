package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.PortfolioFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * Portfolio 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioFacade portfolioFacade;


    /**
     * 投组查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<PortfolioRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<PortfolioReqDTO> param
    ) {
        return CommonResponse.success(portfolioFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 投组新增
     */
    @PostMapping("/addPortfolio")
    public CommonResponse<Boolean> addPortfolio(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PortfolioAddReqDTO param
    ) {
        return CommonResponse.success(portfolioFacade.addPortfolio(operatorId, param));
    }

    /**
     * 投组修改
     */
    @PostMapping("/update")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PortfolioAddReqDTO param
    ) {
        return CommonResponse.success(portfolioFacade.updateData(operatorId, param));
    }

    /**
     * 投组删除
     */
    @PostMapping("/delete")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PortfolioReqDTO param
    ) {
        return CommonResponse.success(portfolioFacade.deleteSubmit(operatorId, param));
    }

    /**
     * 投组查询详细
     */
    @PostMapping("/queryDetailData")
    public CommonResponse<PortfolioRspVO> queryDetailData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PortfolioDetailReqDTO param
    ) {
        return CommonResponse.success(portfolioFacade.queryDetailData(operatorId, param));
    }

    /**
     * 投组设置审批通过回调
     */
    @PostMapping("/passApproval")
    public CommonResponse<Boolean> passApproval(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody ApproveDTO param
    ) {
        return CommonResponse.success(portfolioFacade.passApproval(operatorId, param));
    }

    /**
     * 投组设置审批拒绝回调
     */
    @PostMapping("/refuseApproval")
    public CommonResponse<Boolean> refuseApproval(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody ApproveDTO param
    ) {
        return CommonResponse.success(portfolioFacade.refuseApproval(operatorId, param));
    }
}