package com.hbo.service;

import com.hbo.model.Show;
import com.hbo.repository.ShowRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ShowService {
    private final ShowRepository showRepository;

    public List<Show> getAllShows(){
        return showRepository.findAll();
    }

    public Optional<Show> getOneShow(Long id) {
        return showRepository.findById(id);
    }

    public void saveShow(Show show) {
        showRepository.save(show);
    }

    public void deleteShow(Long id) {
        showRepository.deleteById(id);
    }
}
