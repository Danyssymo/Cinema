package project.cinema.classes.logic;

import project.cinema.classes.entity.Film;

import java.util.List;

public interface CinemaLogic {
    public void add(Film film) throws LogicException;// update

    public List<Film> find(String text) throws LogicException;
    public List<Film> allFilms() throws LogicException;
    public void clean() throws LogicException;
    public void update(Film film) throws LogicException;

    public List<Film> sort(String text) throws LogicException;

    public void deleteById(int id) throws LogicException;
}
