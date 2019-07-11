package com.example.test;

/**
 * Created by Victor Oliveira on 2019-07-10.
 */
public class Result {
    public boolean isSuccess() {
        return success;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private boolean success = false;
    public String getSubject() {
        return subject;
    }

    private String errorMessage ;

    private String subject = "";

}
