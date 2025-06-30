package com.kingstar.ficc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.kingstar.ficc.common.CommonResponse;
import com.kingstar.ficc.common.PageRequest;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import com.kingstar.ficc.facade.CurrencyFacade;
import com.kingstar.ficc.vo.*;
import com.kingstar.ficc.dto.*;
import java.util.List;

/**
 * Currency 控制层
 * @author wenjie.cheng
 */
@RestController
@RequestMapping("/commons/currency")
public class CurrencyController {

    @Autowired
    private CurrencyFacade currencyFacade;


    /**
     * 货币定义查询
     */
    @PostMapping("/queryDataByPage")
    public CommonResponse<IPage<CurrencyQueryRspVO> > queryData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody PageRequest<CurrencyQueryReqDTO> param
    ) {
        return CommonResponse.success(currencyFacade.queryData(operatorId, param.getPageNo(), param.getPageSize(), param.getData()));
    }

    /**
     * 货币定义新增
     */
    @PostMapping("/addCurrency")
    public CommonResponse<Boolean> addCurrency(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CurrencyAddReqDTO param
    ) {
        return CommonResponse.success(currencyFacade.addCurrency(operatorId, param));
    }

    /**
     * 货币定义修改
     */
    @PostMapping("/update")
    public CommonResponse<Boolean> updateData(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CurrencyAddReqDTO param
    ) {
        return CommonResponse.success(currencyFacade.updateData(operatorId, param));
    }

    /**
     * 货币定义删除
     */
    @PostMapping("/delete")
    public CommonResponse<Boolean> deleteSubmit(
            @RequestHeader("x-kingstar-employee-no") String operatorId,
            @Validated @RequestBody CurrencyQueryReqDTO param
    ) {
        return CommonResponse.success(currencyFacade.deleteSubmit(operatorId, param));
    }
}