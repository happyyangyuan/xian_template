package com.yourcomany.demospringbootplugin.modle;

/**
 * @author happyyangyuan
 */
public class Result {
    public static final String CODE_SUCCESS = "SUCCESS";
    public static final String CODE_FAILURE = "FAILURE";
    private String code;
    private String data;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public static Result success() {
        Result result = new Result();
        result.setCode(CODE_SUCCESS);
        return result;
    }

    public static Result failure(String failureMessage) {
        Result result = new Result();
        result.setCode(CODE_FAILURE);
        result.setMessage(failureMessage);
        return result;
    }
}
