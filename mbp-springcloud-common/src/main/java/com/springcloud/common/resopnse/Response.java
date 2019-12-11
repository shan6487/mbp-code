package com.springcloud.common.resopnse;

/**
 * @Author: xieyongshan
 * @Date: 2019/8/22 13:37
 * @Description: todo
 */
public class Response<T> {

    private static final long serialVersionUID = -3699132239407472292L;
    private Integer code;

    private String msg;

    private T result;

    public Response(){
    }

    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Response(T result) {
        this.result = result;
    }

    public Response(Integer code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
