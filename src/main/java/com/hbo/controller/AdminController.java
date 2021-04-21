package com.hbo.controller;

import com.hbo.model.Show;
import com.hbo.model.ShowDTO;
import com.hbo.service.GenreService;
import com.hbo.service.MapService;
import com.hbo.service.RatingService;
import com.hbo.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {

    private final ShowService showService;
    private final MapService mapService;
    private final RatingService ratingService;
    private final GenreService genreService;

    @GetMapping
    public String getAllShows(Model model) {

        model.addAttribute("shows", showService.getAllShows());

        return "admin";
    }

    @GetMapping("/form")
    public String showAddForm(Model model) {

        ShowDTO showDTO = new ShowDTO();
        model.addAttribute("show", showDTO);
        model.addAttribute("ratings", ratingService.getAllRatings());
        model.addAttribute("genres", genreService.getAllGenres());

        return "form";
    }

    @PostMapping("/form")
    public String addShow(@Valid ShowDTO showDTO, BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return "redirect:/admin/form";
        }

        Show show = mapService.mapShow(showDTO);
        showService.saveShow(show);

        return "redirect:/admin";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Show show = showService.getOneShow(id).get();

        model.addAttribute("show", show);
        model.addAttribute("ratings", ratingService.getAllRatings());
        model.addAttribute("genres", genreService.getAllGenres());
        return "update-form";
    }

    @PostMapping("/edit/{id}")
    public String updateShow(@PathVariable Long id, ShowDTO showDTO) {
        Show show = mapService.mapShow(showDTO);
        show.setId(id);
        showService.saveShow(show);

        return "redirect:/admin";
    }

    @GetMapping("/delete/{id}")
    public String deleteShow(@PathVariable Long id) {
        Show show = showService.getOneShow(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid ID: " + id));
        showService.deleteShow(id);

        return "redirect:/admin";
    }

}
