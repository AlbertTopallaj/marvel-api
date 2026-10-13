package com.marvelapi.marvelapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class User {

    @Id
    private UUID id;

    private String username;

    private String password;

    private String email;
}
