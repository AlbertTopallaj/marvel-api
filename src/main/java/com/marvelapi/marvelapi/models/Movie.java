package com.marvelapi.marvelapi.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Entity
@Getter
@Setter
public class Movie {

    private UUID id;

    private String title;

    private Year year;
}
