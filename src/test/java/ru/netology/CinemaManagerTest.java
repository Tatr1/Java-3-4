package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaManagerTest {
    private CinemaManager manager = new CinemaManager();
    private int resultLength;
    private CinemaManager managerResultLength = new CinemaManager(resultLength);
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
        managerResultLength.add(first);
        managerResultLength.add(second);
        managerResultLength.add(third);
        managerResultLength.add(fourth);
        managerResultLength.add(fifth);
        managerResultLength.add(sixth);
        managerResultLength.add(seventh);
        managerResultLength.add(eighth);
        managerResultLength.add(ninth);
        managerResultLength.add(tenth);
        managerResultLength.add(eleventh);
    }

    @Test
    public void add() {
        managerResultLength.add(twelve);
        int actual = managerResultLength.getMovies().length;
        int expected = 12;
        assertEquals(expected, actual);
    }

    @Test
    public void metodChoiceAuto() {
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void metodСhoice0() {
        managerResultLength.setResultLength(0);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void metodСhoice1() {
        managerResultLength.setResultLength(1);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void metodСhoice5() {
        managerResultLength.setResultLength(5);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void metodСhoice10() {
        managerResultLength.setResultLength(10);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void metodСhoice15() {
        managerResultLength.setResultLength(15);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first, null, null, null, null};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void metodСhoiceNegativeNumber() {
        managerResultLength.setResultLength(-1);
        Cinema[] actual = managerResultLength.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
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
        Cinema[] actual = manager.methodOfIssue();
        Cinema[] expected = new Cinema[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
        assertArrayEquals(expected, actual);
    }
}