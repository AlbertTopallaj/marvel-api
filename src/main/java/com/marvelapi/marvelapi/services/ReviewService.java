package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.ReviewRequest;
import com.marvelapi.marvelapi.models.Review;
import com.marvelapi.marvelapi.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewService {

    private ReviewRepository reviewRepository;

    public Review createReview(ReviewRequest reviewRequest) {
        Review review = new Review();

        review.setTitle(reviewRequest.getTitle());
        review.setDescription(reviewRequest.getDescription());

        reviewRepository.save(review);

        return review;

    }

    public Review updateReview(ReviewRequest reviewRequest) {
        Review review = new Review();

        reviewRequest.setTitle(reviewRequest.getTitle());
        reviewRequest.setDescription(reviewRequest.getDescription());

        reviewRepository.save(review);

        return review;
    }
}
