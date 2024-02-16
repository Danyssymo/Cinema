package project.cinema.classes.output;

import project.cinema.classes.entity.Film;

import java.text.SimpleDateFormat;
import java.util.List;

public class CinemaOutput {
    public void print(String title, List<Film> films) {
        System.out.println(" ");
        System.out.println(" " + title.toUpperCase());
        System.out.println(" ");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Film f : films) {
            System.out.println(f.getId() + ") " + f.getFilmName() + " - " + f.getFilmDuration() + " min - " + f.getTicketPrice() + "$ - " + f.getFilmGenre() + " - " + f.getFilmDescription() + " - " + formatter.format(f.getStartOfTheFilm()));
        }

    }
}
