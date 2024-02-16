package project.cinema.classes.controller;

import project.cinema.classes.controller.impl.NoSuchCommand;
import project.cinema.classes.controller.Command;
import project.cinema.classes.controller.CommandName;
import project.cinema.classes.controller.impl.*;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.ADD, new AddFilmCommand());
        repository.put(CommandName.OUTPUT, new OutputFilmCommand());
        repository.put(CommandName.WRONG_REQUEST, new NoSuchCommand());
        repository.put(CommandName.CLEAR, new ClearAllFilmsCommand());
        repository.put(CommandName.UPDATE, new UpdateFilmCommand());
        repository.put(CommandName.FIND, new FindFilmCommand());
        repository.put(CommandName.SORT, new SortCinemaCommand());
        repository.put(CommandName.DELETE, new DeleteFilmCommand());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            //write log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
