package ru.netology;

public class CinemaManager {
    private Cinema[] movies = new Cinema[0];
    Cinema cinema = new Cinema();

    public CinemaManager() {
        cinema.setIndexId(10);
    }

    public CinemaManager(int indexId) {
        cinema.setIndexId(indexId);
    }

    public void add(Cinema movie) {
        int length = movies.length + 1;
        Cinema[] tmp = new Cinema[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Cinema[] choosingTheNumberOfMovies(int indexId) {
        if (indexId == 0) {
            indexId = 10;
        }
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

    public Cinema[] getMovies() {
        return movies;
    }
}