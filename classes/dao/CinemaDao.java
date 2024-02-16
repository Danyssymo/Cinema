package project.cinema.classes.dao;

import project.cinema.classes.dao.DaoException;
import project.cinema.classes.entity.Film;

import java.util.List;

public interface CinemaDao {
    void save(Film film) throws DaoException;

    List<Film> allFilms() throws DaoException;

    void deleteAll() throws DaoException;
    void update(Film film) throws DaoException;

    void deleteById(int id) throws DaoException;
}
