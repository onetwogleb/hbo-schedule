package com.hbo.controller;

import com.hbo.model.Show;
import com.hbo.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("hbo/schedule")
@AllArgsConstructor
public class ShowController {

    private final ShowService showService;

    @GetMapping
    public List<Show> getAllShows(){

        return showService.getAllShows();
    }
}
