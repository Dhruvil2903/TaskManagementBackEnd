package com.dhruvil.taskManagementSystem.service;

import com.dhruvil.taskManagementSystem.dtos.request.LoginRequst;
import com.dhruvil.taskManagementSystem.dtos.request.SignUpRequest;
import com.dhruvil.taskManagementSystem.dtos.response.AuthResponse;

public interface UserService {

    AuthResponse login(LoginRequst loginRequst);
    AuthResponse signUp(SignUpRequest signUpRequest);
}
