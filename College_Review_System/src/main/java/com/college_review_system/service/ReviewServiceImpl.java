package com.college_review_system.service;

import com.college_review_system.model.Review;
import com.college_review_system.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;



    @Override
    public List<Review> getReviews() {
        return reviewRepository.findAll();
    }

    @Override
    public Review addReview(Review review) {
         reviewRepository.save(review);
         return review;
    }

    @Override
    public Review updateReview(Review review, long reviewId) {
        Optional<Review> optional = reviewRepository.findById(reviewId);

        Review newReview = optional.get();

        newReview.setCollege(review.getCollege());
        newReview.setState(review.getState());
        newReview.setCity(review.getCity());
        newReview.setAbout(review.getAbout());

        return reviewRepository.save(newReview);


    }

    @Override
    public void deleteReview(long reviewId) {
        Optional<Review> optional = reviewRepository.findById(reviewId);

        Review newReview = optional.get();

        reviewRepository.delete(newReview);
    }


}
