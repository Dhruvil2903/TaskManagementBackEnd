package com.dhruvil.taskManagementSystem.dtos.response;

public class AuthResponse {

    private String token;
    private String firstName;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
