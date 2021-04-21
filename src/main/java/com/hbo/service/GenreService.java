package com.hbo.service;

import com.hbo.model.Genre;
import com.hbo.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public List<Genre> getAllGenres(){
        return genreRepository.findAll();
    }

    public Optional<Genre> getOneGenre(Long id) {
        return genreRepository.findById(id);
    }

    public void saveGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
