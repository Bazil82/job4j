package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void firstMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 3, 2, 1);
        assertThat(res, is(4));
    }

    @Test
    public void secondMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 5, 2, 1);
        assertThat(res, is(5));
    }

    @Test
    public void thirdMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 5, 6, 1);
        assertThat(res, is(6));
    }

    @Test
    public void forthMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 5, 6, 7);
        assertThat(res, is(7));
    }

    @Test
    public void evenMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 4, 4, 4);
        assertThat(res, is(4));
    }

    @Test
    public void testMax() {
        SqMax check = new SqMax();
        int res = check.max(4, 3, 8, 1);
        assertThat(res, is(8));
    }
}
