package com.college_review_system.controller;


import com.college_review_system.model.Review;
import com.college_review_system.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ReviewController {

   @Autowired
    private ReviewService reviewService;

    @GetMapping("/home")
    public String home(){
        return "abs";
    }


    @PostMapping("/addreview")
    public Review addReview(@RequestBody Review review){
        return reviewService.addReview(review);
    }


    @GetMapping("/getreviews")
    public List<Review> getAllReview(){
        return reviewService.getReviews();
    }

    @PutMapping("/updatereview/{reviewId}")
    public Review updateReview(@RequestBody Review review, @PathVariable long reviewId){

        return reviewService.updateReview(review,reviewId);
    }

    @DeleteMapping("/deletereview/{reviewId}")
    public void deleteteReview( @PathVariable long reviewId){

        reviewService.deleteReview( reviewId);
    }



}
