package com.hr.hrsystem.Util;

import com.hr.hrsystem.entity.Result;

public class ResultUtil {

    private static final Integer SUCCESS_CODE = 0;

    private static final Integer FAILED_CODE = 1;

    private static final String SUCCESS_MSG = "success";

    private static final String FAILED_MSG = "failed";

    public static Result getSuccess() {
        return new Result(SUCCESS_CODE, SUCCESS_MSG);
    }

    public static Result getSuccess(Object data) {
        return new Result(SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static Result getFailed(){
        return new Result(FAILED_CODE, FAILED_MSG);
    }

    public static Result getFailed(int code){
        return new Result(code, FAILED_MSG);
    }
}
