package com.marvelapi.marvelapi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Table(name = "movies")
@Entity
@Getter
@Setter
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String title;

    private Year year;
}
