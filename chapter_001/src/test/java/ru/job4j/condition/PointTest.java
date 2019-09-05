package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distanceOne() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void distanceTwo() {
        int x1 = 5;
        int y1 = 7;
        int x2 = 10;
        int y2 = 12;
        double expected = 7.0710678118654755;
        double out = Point.distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0);
    }
}
