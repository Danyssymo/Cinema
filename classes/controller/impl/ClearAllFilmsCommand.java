package project.cinema.classes.controller.impl;

import project.cinema.classes.controller.Command;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.LogicProvider;

public class ClearAllFilmsCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final CinemaLogic logic = logicProvider.getCinemaLogic();

    @Override
    public String execute(String request) {
        String response = null;
        try {
            logic.clean();
            response = "The file has been cleaned";
        } catch (LogicException e) {
            response = "The file was not cleaned";
        }
        return response;
    }
}
