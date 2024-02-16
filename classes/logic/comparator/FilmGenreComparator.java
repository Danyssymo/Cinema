package project.cinema.classes.logic.comparator;

import project.cinema.classes.entity.Film;

import java.util.Comparator;

public class FilmGenreComparator implements Comparator<Film> {
    @Override
    public int compare(Film f1, Film f2) {
        return f1.getFilmGenre().compareTo(f2.getFilmGenre());
    }
}
