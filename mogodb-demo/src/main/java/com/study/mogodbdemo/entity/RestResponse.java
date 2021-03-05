package com.study.mogodbdemo.entity;

import java.io.Serializable;

public class RestResponse implements Serializable {
    /**
     * 返回对象
     */
    private Object data;
    /**
     * 返回信息描述
     */
    private String message;
    /**
     * 状态码
     */
    private Integer status;

    public RestResponse() {
    }
    public RestResponse(Object data, String message, Integer status) {
        this.data = data;
        this.message = message;
        this.status = status;
    }

    public RestResponse(Object data) {
        this.data = data;
        this.message = "操作成功";
        this.status = 200;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
