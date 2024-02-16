package project.cinema.classes.logic.comparator;

import project.cinema.classes.entity.Film;

import java.util.Comparator;

public class FilmPriceComparator implements Comparator<Film> {
    @Override
    public int compare(Film f1, Film f2) {
        return f1.getTicketPrice() - f2.getTicketPrice();
    }
}
