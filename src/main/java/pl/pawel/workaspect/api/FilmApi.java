package pl.pawel.workaspect.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FilmApi {



    FilmService filmService;

    @Autowired
    public FilmApi(FilmService filmService) {
        this.filmService = filmService;
    }

    @GetMapping("/films")
    public String GetFilm(Model model){
        model.addAttribute("films", filmService.getFilmList());
        model.addAttribute("newFilm", new FilmModel());
        return "films";
    }

    @PostMapping("/films")
    public String AddFilm(@ModelAttribute FilmModel filmModel){
        filmService.addFilm(filmModel);
        return "redirect:/films";
    }



}
