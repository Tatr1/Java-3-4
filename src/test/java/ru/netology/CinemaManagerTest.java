package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaManagerTest {
    private CinemaManager manager = new CinemaManager();


    @BeforeEach
    public void setUp() {
        manager = new CinemaManager();
        manager.add(manager.getFirst());
        manager.add(manager.getSecond());
        manager.add(manager.getThird());
        manager.add(manager.getFourth());
        manager.add(manager.getFifth());
        manager.add(manager.getSixth());
        manager.add(manager.getSeventh());
        manager.add(manager.getEighth());
        manager.add(manager.getNinth());
        manager.add(manager.getTenth());
        manager.add(manager.getEleventh());
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
    public void add(){
        manager.add(manager.getTwelve());
        int actual = manager.getMovies().length;
        int expected = 12;
        assertEquals(expected, actual);
    }
    @Test
    public void get10() {
        Cinema[] actual = manager.get10();
        Cinema[] expected = new Cinema[]{manager.getEleventh(), manager.getTenth(), manager.getNinth(), manager.getEighth(), manager.getSeventh(), manager.getSixth(), manager.getFifth(), manager.getFourth(), manager.getThird(), manager.getSecond()};
        assertArrayEquals(expected, actual);
    }

     @Test
    public void customersСhoice0() {
        Cinema[] actual = manager.indexId(0);
        Cinema[] expected = new Cinema[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice1() {
        Cinema[] actual = manager.indexId(1);
        Cinema[] expected = new Cinema[]{manager.getEleventh()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice5() {
        Cinema[] actual = manager.indexId(5);
        Cinema[] expected = new Cinema[]{manager.getEleventh(), manager.getTenth(), manager.getNinth(), manager.getEighth(), manager.getSeventh()};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoiceNegativeNumber() {
    Cinema[] actual = manager.indexId(-1);
        Cinema[] expected = new Cinema[10];
         assertArrayEquals(expected, actual);
    }

    @Test
    public void customersСhoice15() {
        Cinema[] actual = manager.indexId(15);
        Cinema[] expected = new Cinema[]{manager.getEleventh(), manager.getTenth(), manager.getNinth(), manager.getEighth(), manager.getSeventh(), manager.getSixth(), manager.getFifth(), manager.getFourth(), manager.getThird(), manager.getSecond(), manager.getFirst(), null, null, null, null};
        assertArrayEquals(expected, actual);
    }
 }