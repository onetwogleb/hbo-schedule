package com.hbo.service;

import com.hbo.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RatingService {

    private final RatingRepository ratingRepository;

}
