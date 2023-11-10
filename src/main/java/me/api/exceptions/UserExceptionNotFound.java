package me.api.exceptions;

public class UserExceptionNotFound extends RuntimeException {

    public UserExceptionNotFound(String message) {
        super(message);
    }
}