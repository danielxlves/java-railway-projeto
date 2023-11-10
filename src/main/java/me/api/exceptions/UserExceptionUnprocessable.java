package me.api.exceptions;

public class UserExceptionUnprocessable extends RuntimeException {

    public UserExceptionUnprocessable(String message) {
        super(message);
    }
}