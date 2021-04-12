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
@RequestMapping("hbo/schedule")
@AllArgsConstructor
public class ShowController {

    private final ShowService showService;
    private final MapService mapService;

    @GetMapping
    public List<Show> getAllShows(){

        return showService.getAllShows();
    }

    @PostMapping
    public void addShow(@RequestBody ShowDTO showDTO){
        Show show = mapService.mapShow(showDTO);
        showService.addShow(show);
    }
}
