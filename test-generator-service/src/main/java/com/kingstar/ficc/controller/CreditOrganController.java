package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.CreditOrganFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * CreditOrgan 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/CreditOrgan")
public class CreditOrganController {

    @Autowired
    private CreditOrganFacade creditOrganFacade;


    /**
     * 评级机构查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<CreditQueryRsqVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<CreditQueryReqDTO> param
    ) {
        return CommonResponse.success(creditOrganFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 评级机构新增
     */
    @PostMapping("/addCreditOrgan")
    public CommonResponse<Boolean> addCreditOrgan(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CreditRankAddReqDTO param
    ) {
        return CommonResponse.success(creditOrganFacade.addCreditOrgan(operatorId, param));
    }

    /**
     * 评级机构修改
     */
    @PostMapping("/update")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CreditRankAddReqDTO param
    ) {
        return CommonResponse.success(creditOrganFacade.updateData(operatorId, param));
    }

    /**
     * 评级机构删除
     */
    @PostMapping("/delete")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CreditQueryReqDTO param
    ) {
        return CommonResponse.success(creditOrganFacade.deleteSubmit(operatorId, param));
    }
}