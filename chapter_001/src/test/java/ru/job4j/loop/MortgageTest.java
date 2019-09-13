package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when11Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 100, 1);
        assertThat(year, is(11));
    }

    @Test
    public void when15Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 501, 50);
        assertThat(year, is(15));
    }
}
