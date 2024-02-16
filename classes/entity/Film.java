package project.cinema.classes.entity;

import edu.examples.java_classes.util.GenerateId;
import project.cinema.classes.util.CreateNewDate;

import java.util.Date;
import java.util.Objects;

public class Film {

    private int id;
    private String filmName;
    private int filmDuration;
    private int ticketPrice;
    private String filmGenre;
    private String filmDescription;
    private Date startOfTheFilm;

    public Film(){
    }

    public Film(int id, String filmName, int filmDuration, int ticketPrice, String filmGenre, String filmDescription, Date startOfTheFilm) {
        this.id = id;
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.ticketPrice = ticketPrice;
        this.filmGenre = filmGenre;
        this.filmDescription = filmDescription;
        this.startOfTheFilm = startOfTheFilm;
    }

    public Film(String filmName, int filmDuration, int ticketPrice, String filmGenre, String filmDescription, Date startOfTheFilm) {
        this.id = GenerateId.nextId();
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.ticketPrice = ticketPrice;
        this.filmGenre = filmGenre;
        this.filmDescription = filmDescription;
        this.startOfTheFilm = startOfTheFilm;
    }

    public Film(String filmName, int filmDuration, int ticketPrice, String filmGenre, String filmDescription) {
        this.id = GenerateId.nextId();
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.ticketPrice = ticketPrice;
        this.filmGenre = filmGenre;
        this.filmDescription = filmDescription;
        this.startOfTheFilm = CreateNewDate.addDate();
    }

    public Film(String filmName, int filmDuration, String filmGenre, String filmDescription) {
        this.id = GenerateId.nextId();
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.ticketPrice = 0;
        this.filmGenre = filmGenre;
        this.filmDescription = filmDescription;
        this.startOfTheFilm = CreateNewDate.addDate();
    }

    public Film(String filmName, int filmDuration, String filmGenre) {
        this.id = GenerateId.nextId();
        this.filmName = filmName;
        this.filmDuration = filmDuration;
        this.ticketPrice = 0;
        this.filmGenre = filmGenre;
        this.filmDescription = "without a description";
        this.startOfTheFilm = CreateNewDate.addDate();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getFilmDuration() {
        return filmDuration;
    }

    public void setFilmDuration(int filmDuration) {
        this.filmDuration = filmDuration;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public Date getStartOfTheFilm() {
        return startOfTheFilm;
    }

    public void setStartOfTheFilm(Date startOfTheFilm) {
        this.startOfTheFilm = startOfTheFilm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && filmDuration == film.filmDuration && ticketPrice == film.ticketPrice && Objects.equals(filmName, film.filmName) && Objects.equals(filmGenre, film.filmGenre) && Objects.equals(filmDescription, film.filmDescription) && Objects.equals(startOfTheFilm, film.startOfTheFilm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, filmName, filmDuration, ticketPrice, filmGenre, filmDescription, startOfTheFilm);
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", filmName='" + filmName + '\'' +
                ", filmDuration=" + filmDuration +
                ", ticketPrice=" + ticketPrice +
                ", filmGenre='" + filmGenre + '\'' +
                ", filmDescription='" + filmDescription + '\'' +
                ", startOfTheFilm=" + startOfTheFilm +
                '}';
    }
}
