package com.tjetc.common;

public class Result<T> {
    private Integer code; // code：业务状态码，例如 200
    private String message; //message：提示信息，例如“操作成功”
    private T data; //data：真正返回的业务数据，类型由 T 决定

    public Result(){}
    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
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
    //success 方法
    public static <T> Result<T> success(T data) {
        return new Result<>(200,"操作成功",data);
    }
    //fail 方法
    public static <T> Result<T> fail(Integer code,String message) {
        return  new Result<>(code,message,null);
    }

}
