package com.marvelapi.marvelapi.controllers;

import com.marvelapi.marvelapi.dtos.UserRequest;
import com.marvelapi.marvelapi.models.User;
import com.marvelapi.marvelapi.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody UserRequest request) {
        return userService.createUser(request);
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable UUID userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }
}
