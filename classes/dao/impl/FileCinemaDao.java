package project.cinema.classes.dao.impl;

import project.cinema.classes.dao.CinemaDao;
import project.cinema.classes.dao.DaoException;
import project.cinema.classes.entity.Film;
import project.cinema.classes.util.CreateNewDate;

import java.util.List;

public class FileCinemaDao implements CinemaDao {
    CinemaDataBase myDb = new CinemaDataBase();

    @Override
    public void save(Film film) throws DaoException {
        int id = myDb.getId();
        film.setId(id);

        if (film.getStartOfTheFilm() == null){
            film.setStartOfTheFilm(CreateNewDate.addDate());
        }

        myDb.writeToFile(film);
    }

    @Override
    public List<Film> allFilms() throws DaoException {
        return myDb.readFromFile();
    }

    @Override
    public void deleteAll() throws DaoException {
        myDb.clean();
    }

    @Override
    public void update(Film film) throws DaoException {
        myDb.update(film);
    }

    @Override
    public void deleteById(int id) throws DaoException {
        myDb.deleteById(id);
    }
}
