package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.UserRequest;
import com.marvelapi.marvelapi.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User createUser(UserRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        return user;
    }
}
