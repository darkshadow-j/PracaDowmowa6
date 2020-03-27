package pl.pawel.workaspect.api;

public class FilmModel {

    private String Title;

    public FilmModel() {
    }

    public FilmModel(String title) {
        Title = title;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
