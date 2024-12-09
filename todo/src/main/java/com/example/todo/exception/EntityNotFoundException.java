package com.example.todo.exception;

public class EntityNotFoundException extends RuntimeException{

    private ErrorCodes errorCodes;

    public EntityNotFoundException(String message){
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause){
        super(message,cause);
    }

    public EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCode){
        super(message,cause);
        this.errorCodes = errorCode;
    }

    public EntityNotFoundException(String message, ErrorCodes errorCode){
        super(message);
        this.errorCodes = errorCode;
    }

    public ErrorCodes getErrorCodes(){
        return errorCodes;
    }
}
