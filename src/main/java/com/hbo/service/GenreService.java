package com.hbo.service;

import com.hbo.repository.GenreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class GenreService {

    private final GenreRepository genreRepository;
}
