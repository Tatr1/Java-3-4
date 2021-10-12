package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaManagerTest {
    private Cinema[] movies = new Cinema[0];
    private CinemaManager manager = new CinemaManager();
    int choiceClient;
    private CinemaManager manager1 = new CinemaManager(choiceClient);
    private Cinema cinema = new Cinema();
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

    @BeforeEach
    public void setUp() {
        manager = new CinemaManager();
        manager1 = new CinemaManager();
        manager1.add(first);
        manager1.add(second);
        manager1.add(third);
        manager1.add(fourth);
        manager1.add(fifth);
        manager1.add(sixth);
        manager1.add(seventh);
        manager1.add(eighth);
        manager1.add(ninth);
        manager1.add(tenth);
        manager1.add(eleventh);
    }

    @Test
    void createToZero() {
        Cinema movies = new Cinema();
        assertEquals(0, movies.getId());
        assertEquals(0, movies.getIndexId());
        assertEquals(null, movies.getStyle());
        assertEquals(null, movies.getName());
        assertEquals(null, movies.getPicture());
    }

    @Test
    public void add() {
        manager1.add(twelve);
        int actual = manager1.getMovies().length;
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void customersСhoice0() {
        Cinema[] actual = manager1.choosingTheNumberOfMovies(0);
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice1() {
        Cinema[] actual = manager1.choosingTheNumberOfMovies(1);
        Cinema[] expected = new Cinema[]{eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice5() {
        Cinema[] actual = manager1.choosingTheNumberOfMovies(5);
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoiceNegativeNumber() {
        Cinema[] actual = manager1.choosingTheNumberOfMovies(-1);
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice15() {
        Cinema[] actual = manager1.choosingTheNumberOfMovies(15);
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first, null, null, null, null};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void Number10() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        Cinema[] actual = manager.choosingTheNumberOfMovies(cinema.getIndexId());//manager.choosingTheNumberOfMovies();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
}