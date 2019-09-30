package com.dingtao.common.bean;

/**
 * @author dingtao
 * @date 2018/12/28 10:05
 * qq:1940870847
 */
public class Result<T>  {

    String message;
    T data;
    String code;

    public Result(String message, T data, String code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
