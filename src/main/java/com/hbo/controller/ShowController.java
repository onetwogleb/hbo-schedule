package com.hbo.controller;

import com.hbo.model.Genre;
import com.hbo.model.Rating;
import com.hbo.model.Show;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("hbo/schedule")
public class ShowController {

    @GetMapping
    public List<Show> getAllShows(){

        return Arrays.asList(
                new Show(1L, "Zack Snyder's Justice League", "Mar 18", "R", "Action", "https://youtu.be/vM-Bja2Gy04"),
                new Show(2L, "Godzilla vs. Kong", "Mar 31", "PG-13", "Action", "http://..."),
                new Show(3L, "Those Who Wish Me Dead", "May 14", "R", "Thriller", "http://..."),
                new Show(4L, "Space Jam: A New Legacy", "Jul 16", "G", "Animation", "http://...")
        );
    }
}
