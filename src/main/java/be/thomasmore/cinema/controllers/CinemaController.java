package be.thomasmore.cinema.controllers;


import be.thomasmore.cinema.model.Cinema;
import be.thomasmore.cinema.repositories.cinemaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CinemaController {
    private final cinemaRepository cinemaRepository;

    public CinemaController(cinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    @GetMapping("/bioscopen")
    public String bioscopen(Model model) {
        Iterable<Cinema> cinemas = cinemaRepository.findAll();
        model.addAttribute("cinemas", cinemas);

        return "bioscopen";
    }
}
