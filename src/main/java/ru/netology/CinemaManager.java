package ru.netology;

import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor

public class CinemaManager {
    private Cinema[] movies = new Cinema[0];
    private Cinema first = new Cinema(0, 1, "action", "Deadpool", "url");
    private Cinema second = new Cinema(0, 2, "comedy", "Zorro", "url");
    private Cinema third = new Cinema(0, 3, "si-fi", "Dune", "url");
    private Cinema fourth = new Cinema(0, 4, "cartoon", "Lion King", "url");
    private Cinema fifth = new Cinema(0, 5, "drama", "1+1", "url");
    private Cinema sixth = new Cinema(0, 6, "action", "Gentlemen", "url");
    private Cinema seventh = new Cinema(0, 7, "cartoon", "Shrek", "url");
    private Cinema eighth = new Cinema(0, 8, "drama", "Pianist", "url");
    private Cinema ninth = new Cinema(0, 9, "comedy", "Groundhog Day", "url");
    private Cinema tenth = new Cinema(0, 10, "cartoon", "Mulan", "url");
    private Cinema eleventh = new Cinema(0, 11, "cartoon", "Up", "url");
    private Cinema twelve = new Cinema(0, 12, "serial", "Supernatiral", "url");

    public CinemaManager(int indexId) {
        Cinema[] movies10 = new Cinema[0];
        this.movies = movies10;
    }

    public void add(Cinema movie) {
        int length = movies.length + 1;
        Cinema[] tmp = new Cinema[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Cinema[] indexId(int indexId) {
        Cinema cinema = new Cinema();
        cinema.setIndexId(indexId);
        indexId = cinema.getIndexId();
        Cinema[] result = new Cinema[indexId];
        for (int i = 0; i < indexId; i++) {
            int index = movies.length - i - 1;
            if (index >= 0) {
                result[i] = movies[index];
            }
        }
        return result;
    }
    public Cinema[] indexId() {
     Cinema[] movies10 = new Cinema[10];
        for (int i = 0; i < 10; i++) {
            int index = movies.length - i - 1;
            if (index >= 0) {
                movies10[i] = movies[index];
             }
        }
        return movies10;
    }
    public Cinema getFirst() {
        return first;
    }

    public Cinema getSecond() {
        return second;
    }

    public Cinema getThird() {
        return third;
    }

    public Cinema getFourth() {
        return fourth;
    }

    public Cinema getFifth() {
        return fifth;
    }

    public Cinema getSixth() {
        return sixth;
    }

    public Cinema getSeventh() {
        return seventh;
    }

    public Cinema getEighth() {
        return eighth;
    }

    public Cinema getNinth() {
        return ninth;
    }

    public Cinema getTenth() {
        return tenth;
    }

    public Cinema getEleventh() {
        return eleventh;
    }

    public Cinema getTwelve() {
        return twelve;
    }

    public Cinema[] getMovies() {
        return movies;
    }
}
