package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.ReviewRequest;
import com.marvelapi.marvelapi.models.Review;
import com.marvelapi.marvelapi.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ReviewService {

    private ReviewRepository reviewRepository;

    public Review createReview(ReviewRequest reviewRequest) {
        if (reviewRequest.getTitle() == null || reviewRequest.getTitle().isBlank()) {
            throw new IllegalArgumentException("Titel saknas");
        }
        if (reviewRequest.getDescription() == null || reviewRequest.getDescription().isBlank()){
            throw new IllegalArgumentException("Beskrivning saknas");
        }
        Review review = new Review();

        review.setTitle(reviewRequest.getTitle());
        review.setDescription(reviewRequest.getDescription());

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
}
