package com.mvc.http;

/**
 * @author GTsung
 * @date 2021/10/18
 */
public enum  HttpStatus {

    OK(200, "OK");

    private final int value;

    private final String reasonPhrase;


    HttpStatus(int value, String reasonPhrase) {
        this.value = value;
        this.reasonPhrase = reasonPhrase;
    }

    public int getValue() {
        return value;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }
}
