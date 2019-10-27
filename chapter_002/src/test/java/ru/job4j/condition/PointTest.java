package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void pointOne() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double exp = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(exp, out, 0);
    }

    @Test
    public void pointTwo() {
        Point a = new Point(0, -3, 3);
        Point b = new Point(3, 1, 3);
        double exp = 5.0;
        double out = a.distance3d(b);
        Assert.assertEquals(exp, out, 0);
    }

}
