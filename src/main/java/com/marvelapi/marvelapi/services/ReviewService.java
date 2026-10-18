package com.marvelapi.marvelapi.services;

import com.marvelapi.marvelapi.dtos.ReviewRequest;
import com.marvelapi.marvelapi.models.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    public Review createReview(ReviewRequest reviewRequest) {
        Review review = new Review();

        reviewRequest.setTitle(reviewRequest.getTitle());
        reviewRequest.setDescription(reviewRequest.getDescription());


    }
}
