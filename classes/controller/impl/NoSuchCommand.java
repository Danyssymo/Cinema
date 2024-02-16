package project.cinema.classes.controller.impl;

import project.cinema.classes.controller.Command;

public class NoSuchCommand implements Command {
    @Override
    public String execute(String request) {
            return "Request error";
    }
}
