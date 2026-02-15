package be.thomasmore.cinema.controllers;

import be.thomasmore.cinema.model.Movie;
import be.thomasmore.cinema.repositories.movieRepository;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {
    private final movieRepository movieRepository;

    public MovieController(movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @GetMapping("/films")
    public String movieList(Model model) {
        Iterable<Movie> movies = movieRepository.findAll();
        model.addAttribute("movies", movies);

        return "films";
    }
}
