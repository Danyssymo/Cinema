package project.cinema.classes.logic.comparator;

import project.cinema.classes.entity.Film;

import java.util.Comparator;

public class FilmDurationComparator implements Comparator<Film> {

    @Override
    public int compare(Film f1, Film f2) {
        return f1.getFilmDuration() - f2.getFilmDuration();
    }
}
