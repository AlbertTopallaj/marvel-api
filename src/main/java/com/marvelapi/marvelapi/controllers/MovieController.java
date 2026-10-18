package com.marvelapi.marvelapi.controllers;

import com.marvelapi.marvelapi.models.Movie;
import com.marvelapi.marvelapi.repositories.MovieRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    private MovieRepository movieRepository;

    @PostMapping("/add")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }

}
