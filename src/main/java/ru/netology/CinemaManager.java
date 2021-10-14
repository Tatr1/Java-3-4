package ru.netology;

public class CinemaManager {
    private Cinema[] movies = new Cinema[0];
    private int resultLength;


    public CinemaManager() {
        this.movies = movies;
    }

    public CinemaManager(int resultLength) {
        this.movies = movies;
    }

    public void add(Cinema movie) {
        int length = movies.length + 1;
        Cinema[] tmp = new Cinema[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Cinema[] methodOfIssue() {
        if (resultLength <= 0) {
            resultLength = 10;
        }
        Cinema[] result = new Cinema[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            if (index >= 0) {
                result[i] = movies[index];
            }
        }
        return result;
    }

    public void setResultLength(int resultLength) {
        this.resultLength = resultLength;
    }

    public Cinema[] getMovies() {
        return movies;
    }
}