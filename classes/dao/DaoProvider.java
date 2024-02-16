package project.cinema.classes.dao;

import project.cinema.classes.dao.CinemaDao;
import project.cinema.classes.dao.impl.FileCinemaDao;

public class DaoProvider {
    private static final DaoProvider INSTANCE = new DaoProvider();

    private DaoProvider() {}

    private CinemaDao cinemaDao = new FileCinemaDao();


    public CinemaDao getCinemaDao() {
        return cinemaDao;
    }

    public static DaoProvider getInstance() {
        return INSTANCE;
    }
}
