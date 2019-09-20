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
}
