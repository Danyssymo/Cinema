package project.cinema.classes.controller;

import project.cinema.classes.controller.Command;
import project.cinema.classes.controller.CommandProvider;

public class Controller {
    private final char paramDelimeter = '\n';

    private final CommandProvider provider = new CommandProvider();

    public String doAction(String request) {
        String command;
        command = request.substring(0, request.indexOf(paramDelimeter));
        command = command.toUpperCase();

        String commandName;
        Command executionCommand;

        commandName = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;

    }
}
