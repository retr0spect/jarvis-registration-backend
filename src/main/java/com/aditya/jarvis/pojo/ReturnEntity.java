package com.aditya.jarvis.pojo;

import java.util.List;

/**
 * Created by Aditya on 9/20/2018.
 */
public class ReturnEntity {
    private String status;
    private List<Object> data;
    private String message;

    public ReturnEntity(String status, List<Object> data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Object> getData() {
        return data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
