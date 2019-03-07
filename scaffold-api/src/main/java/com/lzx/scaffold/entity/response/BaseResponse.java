package com.lzx.scaffold.entity.response;

import java.io.Serializable;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:06
 * @Description: 返回对象父类
 */
public class BaseResponse implements Serializable {

    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 返回的时间（yyyy-MM-dd HH:mm:ss:SSS）
     */
    private String time;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "BaseResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ", time='" + time + '\'' +
                '}';
    }
}
