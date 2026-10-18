package com.marvelapi.marvelapi.controllers;

import com.marvelapi.marvelapi.dtos.MovieRequest;
import com.marvelapi.marvelapi.models.Movie;
import com.marvelapi.marvelapi.repositories.MovieRepository;
import com.marvelapi.marvelapi.services.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
@AllArgsConstructor
public class MovieController {

    private MovieService movieService;

    @PostMapping("/add")
    public Movie addMovie(@RequestBody MovieRequest movieRequest) {
        return movieService.addMovie(movieRequest);
    }

    @GetMapping("/find")
    public List<Movie> findMovies() {
        return movieService.getMovies();
    }
}
