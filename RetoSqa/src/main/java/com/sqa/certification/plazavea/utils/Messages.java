package com.sqa.certification.plazavea.utils;

public enum Messages {
    MSG_INCORRECT("Message incorrect: empty cart");
    private String msg;

    private Messages(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }
}
