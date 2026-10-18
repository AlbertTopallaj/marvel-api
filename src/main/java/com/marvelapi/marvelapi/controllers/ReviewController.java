    package com.marvelapi.marvelapi.controllers;

    import com.marvelapi.marvelapi.dtos.ReviewRequest;
    import com.marvelapi.marvelapi.models.Review;
    import com.marvelapi.marvelapi.services.ReviewService;
    import lombok.AllArgsConstructor;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.UUID;

    @RestController
    @RequestMapping("/review")
    @AllArgsConstructor
    public class ReviewController {

        private ReviewService reviewService;

        @PostMapping("/create")
        public Review createReview(@RequestBody ReviewRequest reviewRequest) {
            return reviewService.createReview(reviewRequest);
        }

        @PatchMapping("/update/{reviewId}")
        public Review updateReview(@RequestBody ReviewRequest reviewRequest, @PathVariable UUID reviewId) {
            return reviewService.updateReview(reviewId, reviewRequest);
        }

        @DeleteMapping("/delete/{reviewId}")
        public void deleteReview(@PathVariable UUID reviewId) {
            reviewService.deleteReview(reviewId);
        }

        @GetMapping("/{movieId}/reviews")
        public List<Review> getReviews(@PathVariable UUID movieId) {
            return reviewService.getReviewsByMovie(movieId);
        }

    }
