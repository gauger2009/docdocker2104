package com.gauge.docdocker.model;


import org.springframework.context.annotation.Configuration;

/**
 * @Author: Andrew
 * @Date: 2021/5/11 23:00
 * @Description:
 */
@Configuration
public class ResponseEntityModel {
    private StatusEnum status;
    private String message;
    private Object data;

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

