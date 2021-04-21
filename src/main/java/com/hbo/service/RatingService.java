package com.hbo.service;

import com.hbo.model.Rating;
import com.hbo.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class RatingService {
    private final RatingRepository ratingRepository;

    public List<Rating> getAllRatings(){
        return ratingRepository.findAll();
    }

    public Optional<Rating> getOneRating(Long id) {
        return ratingRepository.findById(id);
    }

    public void saveRating(Rating rating) {
        ratingRepository.save(rating);
    }

    public void deleteRating(Long id) {
        ratingRepository.deleteById(id);
    }
}
