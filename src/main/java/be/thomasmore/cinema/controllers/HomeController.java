package be.thomasmore.cinema.controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "home"})
    public String home(Model model) {
        return "home";
    }

    @GetMapping({"bioscopen"})
    public String bioscopen(Model model) {
        return "bioscopen";
    }

    @GetMapping({"tarieven"})
    public String tarieven(Model model) {
        return "tarieven";
    }
}