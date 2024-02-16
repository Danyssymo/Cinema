package project.cinema.classes.logic.impl;


import project.cinema.classes.dao.CinemaDao;
import project.cinema.classes.dao.DaoException;
import project.cinema.classes.dao.DaoProvider;
import project.cinema.classes.entity.Film;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.comparator.*;
import project.cinema.classes.output.CinemaOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CinemaLogicImpl implements CinemaLogic {
    private final DaoProvider provider = DaoProvider.getInstance();
    private final CinemaDao dao = provider.getCinemaDao();

    @Override
    public void add(Film film) throws LogicException {
        try {
            dao.save(film);
        } catch (DaoException e) {
            throw new LogicException(e);
        }
    }

    @Override
    public List<Film> find(String text) throws LogicException {
        List<Film> result = new ArrayList<>();

        List<Film> myFilms;
        try {
            myFilms = dao.allFilms();
        } catch (DaoException e) {
            throw new LogicException(e);
        }

        for (Film f : myFilms) {
            if (isTextInNote(f, text)) {
                result.add(f);
            }
        }
        CinemaOutput output = new CinemaOutput();
        output.print("search by: " + text, result);
        return result;
    }

    private boolean isTextInNote(Film f, String text) throws LogicException {
        return f.getFilmName().contains(text) || f.getFilmGenre().contains(text) || f.getFilmDescription().contains(text);
    }

    @Override
    public List<Film> allFilms() throws LogicException {
        try {
            return dao.allFilms();
        } catch (DaoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clean() throws LogicException {
        try {
            dao.deleteAll();
        } catch (DaoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Film film) throws LogicException {
        try {
            dao.update(film);
        } catch (DaoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Film> sort(String text) throws LogicException {
        List<Film> fi;
        try {
            fi = dao.allFilms();
        } catch (DaoException e) {
            throw new RuntimeException(e);
        }
        if (text.equals("NAME")){
            fi.sort(new FilmNameComparator());
        }
        if (text.equals("DURATION")){
            fi.sort(new FilmDurationComparator());
        }
        if (text.equals("PRICE")){
            fi.sort(new FilmPriceComparator());
        }
        if (text.equals("GENRE")){
            fi.sort(new FilmGenreComparator());
        }
        if (text.equals("DESCRIPTION")){
            fi.sort(new FilmDescriptionComparator());
        }
        if (text.equals("DATA")){
            fi.sort(new FilmDataComparator());
        }
        return fi;
    }

    @Override
    public void deleteById(int id) throws LogicException {
        try {
            dao.deleteById(id);
        } catch (DaoException e) {
            throw new RuntimeException(e);
        }
    }
}
