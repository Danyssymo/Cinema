package project.cinema.classes.controller.impl;


import project.cinema.classes.controller.Command;
import project.cinema.classes.entity.Film;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.LogicProvider;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddFilmCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final CinemaLogic logic = logicProvider.getCinemaLogic();

    @Override
    public String execute(String request) {
        String response = null;
        String[] params;
        Film newFilm;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        params = request.split("\n");
        newFilm = new Film();
        newFilm.setFilmName(params[1].split("=")[1]);
        newFilm.setFilmDuration(Integer.parseInt(params[2].split("=")[1]));
        newFilm.setTicketPrice(Integer.parseInt(params[3].split("=")[1]));
        newFilm.setFilmGenre(params[4].split("=")[1]);
        newFilm.setFilmDescription(params[5].split("=")[1]);
        if (params.length == 7){
            String stringDate = (params[6].split("=")[1]);
            try {
                Date myDate = formatter.parse(stringDate);
                newFilm.setStartOfTheFilm(myDate);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            logic.add(newFilm);
            response = "The record was saved successfully.";
        } catch (LogicException e) {
            response = "Something went wrong. Try again";
        }

        return response;
    }
}
