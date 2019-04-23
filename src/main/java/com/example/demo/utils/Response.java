package com.example.demo.utils;

/**
 * @Author: Seth
 * @Date: 2019/3/15 16:37
 * @Version 1.0
 */
public class Response {

    public Object data;

    public Integer status;

    public String message;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
