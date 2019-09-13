package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter check = new Counter();
        int test = check.add(1, 10);
        Assert.assertThat(test, is(30));
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneHundredThenTwoThousandFiveHundredFifty() {
        Counter check = new Counter();
        int test = check.add(1, 100);
        Assert.assertThat(test, is(2550));
    }
}
