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

    public Movie addMovie(MovieRequest request) {
        Movie movie = new Movie();

        movie.setTitle(request.getTitle());
        movie.setYear(request.getYear());

        movieRepository.save(movie);

        return movie;
    }

    public List<Movie> getMovies(){
        return movieRepository.findAll();
    }
}
