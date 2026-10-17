package com.marvelapi.marvelapi.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserRequest {
    private String username;
    private String password;
}
