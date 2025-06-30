package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.FundAccountFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * FundAccount 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/FundAccount")
public class FundAccountController {

    @Autowired
    private FundAccountFacade fundAccountFacade;


    /**
     * 资金账户查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<FundAccountRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<FundAccountReqDTO> param
    ) {
        return CommonResponse.success(fundAccountFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }
}