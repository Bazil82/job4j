package ru.job4j.array;

import org.junit.Test;

import java.beans.PropertyEditorSupport;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int res = find.indexOf(input, value);
        int expect = 0;
        assertThat(res, is(expect));
    }

    @Test
    public void whenArrayHas35ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 35;
        int res = find.indexOf(input, value);
        int expect = -1;
        assertThat(res, is(expect));
    }

    @Test
    public void whenArrayHasLength5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = find.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortFiveNumbers() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortThreeNumbers() {
        int[] input = new int[] {3, 5, 1};
        int[] result = FindLoop.sort(input);
        int[] expect = new int[] {1, 3, 5};
        assertThat(result, is(expect));
    }
}
