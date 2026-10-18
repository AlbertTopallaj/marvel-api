package com.marvelapi.marvelapi.controllers;

import com.marvelapi.marvelapi.dtos.ReviewRequest;
import com.marvelapi.marvelapi.models.Review;
import com.marvelapi.marvelapi.services.ReviewService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    private ReviewService reviewService;

    @PostMapping("/create")
    public Review createReview(ReviewRequest reviewRequest) {
        return reviewService.createReview(reviewRequest);
    }

}
