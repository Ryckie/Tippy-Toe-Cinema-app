package be.thomasmore.cinema.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "home"})
    public String home() {
        return "home";
    }

    @GetMapping({"bioscopen"})
    public String bioscopen() {
        return "bioscopen";
    }

    @GetMapping({"films"})
    public String films() {
        return "films";
    }

    @GetMapping({"tarieven"})
    public String tarieven() {
        return "tarieven";
    }
}