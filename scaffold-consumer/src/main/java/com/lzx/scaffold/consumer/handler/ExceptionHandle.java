package com.lzx.scaffold.consumer.handler;

import com.lzx.scaffold.entity.response.BaseResponse;
import com.lzx.scaffold.enums.ResultEnum;
import com.lzx.scaffold.utils.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:01
 * @Description:
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse handle(Exception e) {
        if (e instanceof RuntimeException) {
            RuntimeException runtimeException = (RuntimeException) e;
            return ResponseUtil.error(ResultEnum.EXCEPTION.getCode(), runtimeException.getMessage());
        }else {
            logger.error("【系统异常】{}", e);
            return ResponseUtil.error(ResultEnum.EXCEPTION.getCode(), "未知错误");
        }
    }
}
