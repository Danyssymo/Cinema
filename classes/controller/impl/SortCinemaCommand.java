package project.cinema.classes.controller.impl;

import project.cinema.classes.controller.Command;
import project.cinema.classes.entity.Film;
import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.LogicException;
import project.cinema.classes.logic.LogicProvider;
import project.cinema.classes.output.CinemaOutput;

import java.util.Arrays;

public class SortCinemaCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final CinemaLogic logic = logicProvider.getCinemaLogic();
    @Override
    public String execute(String request) {
        CinemaOutput output = new CinemaOutput();
        String response = null;
        String[] params;
        params = request.split("\n");
        String str = (params[1].toUpperCase());
        if (str.equals("NAME") || str.equals("DURATION") || str.equals("PRICE") || str.equals("GENRE") || str.equals("DESCRIPTION") || str.equals("DATA")){
            try {
                output.print("SORT BY " + str,logic.sort(str));
                response = "sorting was completed";
            } catch (LogicException e) {
                response = "sorted is failed";
            }
        } else {
            response = "Enter the correct sorting";
        }
        return response;
    }
}
