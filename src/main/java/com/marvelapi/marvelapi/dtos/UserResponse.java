package com.marvelapi.marvelapi.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Data
@Getter
@Setter
public class UserResponse {
    private UUID id;
    private String token;
    private String username;
}
