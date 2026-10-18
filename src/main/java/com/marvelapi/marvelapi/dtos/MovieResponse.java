package com.marvelapi.marvelapi.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;
import java.util.UUID;

@Data
public class MovieResponse {
    private UUID id;
    private String title;
    private Year year;
}
