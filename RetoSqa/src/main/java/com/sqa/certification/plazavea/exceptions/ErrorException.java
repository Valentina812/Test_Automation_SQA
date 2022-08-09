package com.sqa.certification.plazavea.exceptions;

public class ErrorException extends AssertionError{
    public ErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
