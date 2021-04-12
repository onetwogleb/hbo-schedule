package com.hbo.service;

import com.hbo.model.Genre;
import com.hbo.model.Rating;
import com.hbo.model.Show;
import com.hbo.repository.GenreRepository;
import com.hbo.repository.RatingRepository;
import com.hbo.repository.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ShowService {
    private final ShowRepository showRepository;

    public List<Show> getAllShows(){
        return showRepository.findAll();
    }

    public void addShow(Show show) {

        showRepository.save(show);
    }
}
