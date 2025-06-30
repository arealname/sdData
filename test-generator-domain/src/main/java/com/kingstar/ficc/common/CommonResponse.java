package com.kingstar.ficc.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse<T> implements Serializable {

    public static final Integer SUCCESS_CODE = 200000;
    public static final Integer FAILED_CODE = 200001;

    private static final long serialVersionUID = -837788419279491017L;

    private Integer retCode = SUCCESS_CODE;

    private String retMsg = "SUCCESS";

    private T data;

    public static <T> CommonResponse<T> success(T data) {
        CommonResponse<T> response = new CommonResponse<>();
        response.data = data;
        return response;
    }

    public static <T> CommonResponse<T> success(T data, String retMsg) {
        CommonResponse<T> response = success(data);
        response.retMsg = retMsg;
        return response;
    }

    public static <T> CommonResponse<T> failed(T data){
        CommonResponse<T> response = new CommonResponse<>();
        response.data = data;
        response.retCode = FAILED_CODE;
        response.retMsg = "FAILED";
        return response;
    }

    public static <T> CommonResponse<T> failed(String retMsg){
        return failed(FAILED_CODE, retMsg, null);
    }

    public static <T> CommonResponse<T> failed(Integer retCode, String retMsg){
        return failed(retCode, retMsg, null);
    }

    public static <T> CommonResponse<T> failed(Integer retCode, String retMsg, T data){
        CommonResponse<T> response = new CommonResponse<>();
        response.data = data;
        response.retCode = retCode;
        response.retMsg = retMsg;
        return response;
    }
}