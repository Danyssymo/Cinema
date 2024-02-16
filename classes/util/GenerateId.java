package project.cinema.classes.util;

public class GenerateId {
    private GenerateId() {}

    private static int nextId = 1;

    public static int nextId() {
        return nextId++;
    }
}
