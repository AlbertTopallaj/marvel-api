package com.marvelapi.marvelapi.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserResponse {
    private String token;
    private String username;
}
