package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.models.Movie;
import com.marvelapi.marvelapi.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public Movie addMovie(MovieRequest request) {
        Movie movie = new Movie();
    }
}
