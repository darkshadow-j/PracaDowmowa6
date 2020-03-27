package pl.pawel.workaspect.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawel.workaspect.api.aspect.AddFilm;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmService {


    private List<FilmModel> filmList;

    @Autowired
    public FilmService() {
        this.filmList = new ArrayList<>();
        filmList.add(new FilmModel("Tytanic"));
        filmList.add(new FilmModel("Film2"));
        filmList.add(new FilmModel("Film3"));
    }


    @AddFilm
    public boolean addFilm(FilmModel filmModel) {
        return filmList.add(filmModel);
    }

    public List<FilmModel> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<FilmModel> filmList) {
        this.filmList = filmList;
    }
}
