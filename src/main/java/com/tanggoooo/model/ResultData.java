package com.tanggoooo.model;

public class ResultData {
    private String data;
    private String message;
    private Boolean success;

    public ResultData() {
    }

    public ResultData(String data, String message, Boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
