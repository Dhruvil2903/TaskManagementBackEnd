package com.dhruvil.taskManagementSystem.exceptions.customExceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message){
        super(message);
    }
}
