package com.hbo.service;

import com.hbo.model.Show;
import com.hbo.model.ShowDTO;
import com.hbo.repository.GenreRepository;
import com.hbo.repository.RatingRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MapService {

    private final RatingRepository ratingRepository;
    private final GenreRepository genreRepository;

    public Show mapShow(ShowDTO showDTO) {
        Show show = new Show();
        show.setName(showDTO.getName());
        show.setDate(showDTO.getDate());
        show.setTrailer(showDTO.getTrailer());
        show.setRating(ratingRepository.getOne(showDTO.getRating()));
        show.setGenre(genreRepository.getOne(showDTO.getGenre()));

        return show;
    }

    public Show mapShow(Show show, ShowDTO showDTO) {
        show.setName(showDTO.getName());
        show.setDate(showDTO.getDate());
        show.setTrailer(showDTO.getTrailer());
        show.setRating(ratingRepository.getOne(showDTO.getRating()));
        show.setGenre(genreRepository.getOne(showDTO.getGenre()));

        return show;
    }
}
