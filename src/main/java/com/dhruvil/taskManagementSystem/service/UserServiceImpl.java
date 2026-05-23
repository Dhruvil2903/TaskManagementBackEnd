package com.dhruvil.taskManagementSystem.service;

import com.dhruvil.taskManagementSystem.dtos.request.LoginRequst;
import com.dhruvil.taskManagementSystem.dtos.request.SignUpRequest;
import com.dhruvil.taskManagementSystem.dtos.response.AuthResponse;
import com.dhruvil.taskManagementSystem.entity.User;
import com.dhruvil.taskManagementSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public AuthResponse login(LoginRequst loginRequst) {

        Optional<User> userExist= userRepository.findByUserId(loginRequst.getId());

        if(!userExist.isPresent()){
            throw new 
        }
        return null;
    }

    @Override
    public AuthResponse signUp(SignUpRequest signUpRequest) {
        return null;
    }
}
