package be.thomasmore.cinema.controllers;

import be.thomasmore.cinema.model.Movie;
import be.thomasmore.cinema.repositories.movieRepository;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MovieController {

    private final movieRepository movieRepository;

    public MovieController(movieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/films")
    public String movieList(Model model,
                            @RequestParam(required = false) String movieName, @RequestParam(required = false) String genre,
                            @RequestParam(required = false) Integer minReleaseYear,
                            @RequestParam(required = false) Integer maxReleaseYear,
                            @RequestParam(required = false) Integer minFreeSeats) {
        Iterable<Movie> movies = movieRepository.findByFilters(movieName, genre, minReleaseYear, maxReleaseYear, minFreeSeats);

        model.addAttribute("movies", movies);

        return "films";
    }
}