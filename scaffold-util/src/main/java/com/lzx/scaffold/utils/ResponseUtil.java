package com.lzx.scaffold.utils;

import com.lzx.scaffold.entity.response.BaseResponse;
import com.lzx.scaffold.enums.ResultEnum;

import java.util.Date;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:20
 * @Description: 返回类工具类
 */
public class ResponseUtil {

    /**
     * 成功
     * @return
     */
    public static BaseResponse success(Object data){
        BaseResponse response = new BaseResponse();
        response.setCode(ResultEnum.SUCCESS.getCode());
        response.setMsg(ResultEnum.SUCCESS.getMsg());
        response.setData(data);
        response.setTime(DateUtil.formatDate(new Date(),DateUtil.YEAR_MONTH_DAY_SECOND_MILLISECOND));
        return response;
    }


    /**
     * 失败
     * @return
     */
    public static BaseResponse error(String code,String msg){
        BaseResponse response = new BaseResponse();
        response.setCode(code);
        response.setMsg(msg);
        response.setTime(DateUtil.formatDate(new Date(),DateUtil.YEAR_MONTH_DAY_SECOND_MILLISECOND));
        return response;
    }
}
