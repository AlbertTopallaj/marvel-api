package com.marvelapi.marvelapi.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Table(name = "users")
@Entity
@Getter
@Setter
public class User {

    @Id
    private UUID id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String password;

    @Column(unique = true)
    private String email;
}
