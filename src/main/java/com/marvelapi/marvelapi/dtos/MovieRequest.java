package com.marvelapi.marvelapi.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.Year;

@Data
@Getter
@Setter
public class MovieRequest {
    private String title;
    private Year year;
}
