package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHubndredTwenty() {
        Factorial check = new Factorial();
        int test = check.calc(5);
        Assert.assertThat(test, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial check = new Factorial();
        int test = check.calc(0);
        Assert.assertThat(test, is(1));
    }
}
