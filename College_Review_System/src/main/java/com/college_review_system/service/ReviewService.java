package com.college_review_system.service;

import com.college_review_system.model.Review;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReviewService {


    public List<Review> getReviews();

    public Review addReview(Review review);

    public Review updateReview(Review review, long reviewId);

   public void deleteReview(long  reviewId);
}
