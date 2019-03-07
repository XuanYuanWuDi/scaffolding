package com.lzx.scaffold.enums;

/**
 * 返回结果枚举
 */
public enum ResultEnum {

    SUCCESS("0000","成功"),FAILED("0001","失败"),EXCEPTION("0002","异常");

    private String code;

    private String msg;

    ResultEnum(String code,String msg){
         this.code = code;
         this.msg = msg;
    }


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
}
