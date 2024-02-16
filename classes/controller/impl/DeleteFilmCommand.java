package project.cinema.classes.controller.impl;

import project.cinema.classes.controller.Command;
import project.cinema.classes.entity.Film;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.LogicProvider;

public class DeleteFilmCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final CinemaLogic logic = logicProvider.getCinemaLogic();
    @Override
    public String execute(String request) {
        String response = null;
        String[] params;

        params = request.split("\n");
        int myID = Integer.parseInt(params[1].split("=")[1]);

        try {
            logic.deleteById(myID);
            response = "The record was successfully deleted";
        } catch (LogicException e) {
            response = "Error";
        }

        return response;
    }
}
