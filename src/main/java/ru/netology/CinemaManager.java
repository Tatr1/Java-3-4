package ru.netology;

import java.sql.SQLOutput;
import java.util.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CinemaManager {
    private Cinema[] movies = new Cinema[0];
    private Cinema first = new Cinema(1, 1, "action", "Deadpool", "url");
    private Cinema second = new Cinema(2, 2, "comedy", "Zorro", "url");
    private Cinema third = new Cinema(3, 3, "si-fi", "Dune", "url");
    private Cinema fourth = new Cinema(4, 4, "cartoon", "Lion King", "url");
    private Cinema fifth = new Cinema(5, 5, "drama", "1+1", "url");
    private Cinema sixth = new Cinema(6, 6, "action", "Gentlemen", "url");
    private Cinema seventh = new Cinema(7, 7, "cartoon", "Shrek", "url");
    private Cinema eighth = new Cinema(8, 8, "drama", "Pianist", "url");
    private Cinema ninth = new Cinema(9, 9, "comedy", "Groundhog Day", "url");
    private Cinema tenth = new Cinema(10, 10, "cartoon", "Mulan", "url");
    private Cinema eleventh = new Cinema(11, 11, "cartoon", "Up", "url");

    public void add(Cinema movie) {
        int length = movies.length + 1;
        Cinema[] tmp = new Cinema[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }


    public Cinema[] get10() {
        Cinema[] result = new Cinema[10];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном до 10!
        for (int i = 0; i < result.length; i++) {
            //       for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    public Cinema[] indexId(int indexId) {
        if (indexId < 0) {
            Cinema[] result = new Cinema[0];
            return result;
        }
        else {
            Cinema[] result = new Cinema[indexId];
            for (int i = 0; i < indexId; i++) {
                int index = movies.length - i - 1;
                if (index >= 0) {
                    result[i] = movies[index];
                }
            }
           return result;
        }
    }
}