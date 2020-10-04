package com.simpleproject.exception;

public class SpaceXApiException extends Exception {

    public SpaceXApiException(String errorMessage) {
        super(errorMessage);
    }
}
