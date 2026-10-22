package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.UserRequest;
import com.marvelapi.marvelapi.dtos.UserResponse;
import com.marvelapi.marvelapi.models.User;
import com.marvelapi.marvelapi.repositories.UserRepository;
import com.marvelapi.marvelapi.security.JWTService;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.UUID;

@AllArgsConstructor
@Service
public class UserService {

    private final PasswordEncoder passwordEncoder;
    private final JWTService jWTService;
    private UserRepository userRepository;

    public User registerUser(UserRequest request) {
        User user = new User();

        if (request.getUsername() == null || request.getUsername().isBlank()) {
            throw new IllegalArgumentException("Användarnamn saknas.");
        }

        if (request.getPassword() == null || request.getPassword().isBlank()) {
            throw new IllegalArgumentException("Lösenord saknas");
        }

        user.setUsername(request.getUsername());
        user.setPassword(
                passwordEncoder.encode(request.getPassword())
        );

        userRepository.save(user);

        return user;
    }

    public UserResponse loginUser(UserRequest request){
        User user = userRepository.findByUsername(request.getUsername())
                .orElseThrow(() -> new RuntimeException("Användaren finns inte"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Fel lösenord");
        }

        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setToken(jWTService.generateToken(user.getId()));
        response.setUsername(user.getUsername());

        return response;
    }

    public void deleteUser(UUID userId){
        userRepository.deleteById(userId);
    }
}
