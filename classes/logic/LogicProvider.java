package project.cinema.classes.logic;

import project.cinema.classes.logic.CinemaLogic;
import project.cinema.classes.logic.impl.CinemaLogicImpl;

public class LogicProvider {
    private static final LogicProvider instance = new LogicProvider();

    private LogicProvider() {}

    private CinemaLogic logic = new CinemaLogicImpl();

    public CinemaLogic getCinemaLogic() {
        return logic;
    }

    public static LogicProvider getInstance() {
        return instance;
    }
}
