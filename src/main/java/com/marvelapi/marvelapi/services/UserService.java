package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.UserRequest;
import com.marvelapi.marvelapi.models.User;
import com.marvelapi.marvelapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private UserRepository userRepository;

    public User registerUser(UserRequest request) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        userRepository.save(user);

        return user;
    }

    public void deleteUser(UUID userId){
        userRepository.deleteById(userId);
    }
}
