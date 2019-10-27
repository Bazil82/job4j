package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void maxOne() {
        Max test = new Max();
        int exp = 9;
        int out =  test.max(4, 2, 9, 7);
        Assert.assertEquals(exp, out);
    }
}
