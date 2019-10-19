package ru.job4j.array;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@Ignore
public class DuplTest {
    @Test
    public void whenBothEmpty() {
        Dupl algo = new Dupl();
        int[] expect = new int[0];
        int[] result = algo.dupl(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotTakes() {
        Dupl algo = new Dupl();
        int[] expect = {};
        int[] result = algo.dupl(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenEnyTakes() {
        Dupl algo = new Dupl();
        int[] expect = {1, 2, 3, 4};
        int[] result = algo.dupl(
                new int[] {1, 2, 3, 4},
                new int[] {2, 1, 4, 3}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenOneTakes() {
        Dupl algo = new Dupl();
        int[] expect = {3};
        int[] result = algo.dupl(
                new int[] {1, 3, 2, 7},
                new int[] {6, 4, 3, 9}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        Dupl algo = new Dupl();
        int[] expect = {2, 3};
        int[] result = algo.dupl(
                new int[] {1, 2, 3},
                new int[] {3, 2}
        );
        assertThat(result, is(expect));
    }

}
