package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int res = check.max(1, 4, 2);
        assertThat(res, is(4));
    }

    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int res = check.max(5, 4, 2);
        assertThat(res, is(5));
    }

    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int res = check.max(5, 4, 7);
        assertThat(res, is(7));
    }

    @Test
    public void whenEvenMax() {
        MultiMax check = new MultiMax();
        int res = check.max(5, 5, 5);
        assertThat(res, is(5));
    }
}
