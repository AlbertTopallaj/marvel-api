package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.MovieRequest;
import com.marvelapi.marvelapi.models.Movie;
import com.marvelapi.marvelapi.repositories.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MovieService {

    private MovieRepository movieRepository;

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
