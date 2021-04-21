package com.hbo.controller;

import com.hbo.model.Show;
import com.hbo.model.ShowDTO;
import com.hbo.service.MapService;
import com.hbo.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("hbo/shows")
@AllArgsConstructor
public class ShowController {

    private final ShowService showService;
    private final MapService mapService;

    @GetMapping
    public List<Show> getAllShows(){

        return showService.getAllShows();
    }

    @GetMapping("/{id}")
    public Show getOneShow(@PathVariable Long id) {
        return showService.getOneShow(id).get();
    }

    @PostMapping
    public void addShow(@RequestBody ShowDTO showDTO){
        Show show = mapService.mapShow(showDTO);
        showService.saveShow(show);
    }

    @PutMapping("/{id}")
    public void updateShow(@PathVariable Long id, @RequestBody ShowDTO showDTO){
        Show show = showService.getOneShow(id).get();
        mapService.mapShow(show, showDTO);
        showService.saveShow(show);
    }

    @DeleteMapping("/{id}")
    public void deleteShow(@PathVariable Long id){
        showService.deleteShow(id);
    }
}
