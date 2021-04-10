package com.hbo.service;

import com.hbo.model.Show;
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
}
