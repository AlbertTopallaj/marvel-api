package com.marvelapi.marvelapi.controllers;

import com.marvelapi.marvelapi.dtos.UserRequest;
import com.marvelapi.marvelapi.models.User;
import com.marvelapi.marvelapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }
}
