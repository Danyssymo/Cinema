package project.cinema.classes.controller.impl;


import project.cinema.classes.entity.Film;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.LogicProvider;
import project.cinema.classes.controller.Command;
import project.cinema.classes.output.CinemaOutput;

import java.util.List;

public class OutputFilmCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final CinemaLogic logic = logicProvider.getCinemaLogic();
    @Override
    public String execute(String request) {
        String response = null;

        List<Film> myFilms = null;
        try {
            myFilms = logic.allFilms();
        } catch (LogicException e) {
            throw new RuntimeException(e);
        }

        CinemaOutput output = new CinemaOutput();

        output.print("all films", myFilms);

        if (myFilms == null || myFilms.size() <= 0) {
            response = "There are no records to output.";
        } else {
            response = "The output was successful";
        }

        return response;
    }
}
