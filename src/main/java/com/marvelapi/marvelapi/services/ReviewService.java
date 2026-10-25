package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.MovieRequest;
import com.marvelapi.marvelapi.dtos.ReviewRequest;
import com.marvelapi.marvelapi.dtos.UserResponse;
import com.marvelapi.marvelapi.models.Movie;
import com.marvelapi.marvelapi.models.Review;
import com.marvelapi.marvelapi.models.User;
import com.marvelapi.marvelapi.repositories.MovieRepository;
import com.marvelapi.marvelapi.repositories.ReviewRepository;
import com.marvelapi.marvelapi.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReviewService {

    private MovieRepository movieRepository;
    private ReviewRepository reviewRepository;
    private UserRepository userRepository;

    public Review createReview(ReviewRequest reviewRequest) {
        if (reviewRequest.getTitle() == null || reviewRequest.getTitle().isBlank()) {
            throw new IllegalArgumentException("Titel saknas");
        }
        if (reviewRequest.getDescription() == null || reviewRequest.getDescription().isBlank()){
            throw new IllegalArgumentException("Beskrivning saknas");
        }

        User author = userRepository.findById(reviewRequest.getUserId()).orElseThrow();
        Movie movie = movieRepository.findById(reviewRequest.getMovieId()).orElseThrow();

        Review review = new Review();

        review.setTitle(reviewRequest.getTitle());
        review.setDescription(reviewRequest.getDescription());
        review.setAuthor(author);
        review.setMovie(movie);

        reviewRepository.save(review);

        return review;
    }

    public Review updateReview(UUID reviewId, ReviewRequest reviewRequest) {
        if (reviewRequest.getTitle() == null || reviewRequest.getTitle().isBlank()) {
            throw new IllegalArgumentException("Titel saknas");
        }
        if (reviewRequest.getDescription() == null || reviewRequest.getDescription().isBlank()){
            throw new IllegalArgumentException("Beskrivning saknas");
        }

        Review review = reviewRepository.findById(reviewId).orElseThrow();

        review.setTitle(reviewRequest.getTitle());
        review.setDescription(reviewRequest.getDescription());

        reviewRepository.save(review);

        return review;
    }

    public void deleteReview(UUID reviewId){
        reviewRepository.deleteById(reviewId);
    }

    public List<Review> getReviewsByMovie(UUID movieId){
        return reviewRepository.findByMovie_Id(movieId);
    }

    public List<Review> getReviewsByUser(UUID userId) {
        return reviewRepository.findByAuthor_Id(userId);
    }
}
