package be.thomasmore.cinema.controllers;


import be.thomasmore.cinema.model.Cinema;
import be.thomasmore.cinema.repositories.cinemaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

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

        return "cinemas";
    }

    @GetMapping({"/bioscoop/{id}", "/bioscoop"})
    public String bioscoop(Model model, @PathVariable(required = false) Integer id) {
        if (id == null) {
            Iterable<Cinema> cinemas = cinemaRepository.findAll();
            model.addAttribute("cinemas", cinemas);
            return "cinemas";
        }
        Optional<Cinema> cinemaFromDb = cinemaRepository.findById(id);
        if (cinemaFromDb.isPresent()) {
            model.addAttribute("cinema", cinemaFromDb.get());
            return "cinema";
        }

        return "redirect:/bioscopen"; // https://docs.spring.io/spring-framework/reference/web/webmvc/mvc-controller/ann-methods/redirecting-passing-data.html#page-title
    }
}
