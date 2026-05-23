package com.dhruvil.taskManagementSystem.exceptions.customExceptions;

public class UserAlreadyExistException extends RuntimeException{

    public UserAlreadyExistException(String message){
        super(message);
    }
}
