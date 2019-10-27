package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void triangleOne() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(2, 0);

        Triangle one = new Triangle(a, b, c);
        double exp = 1.9999999999999993;
        double out = one.area();
        Assert.assertEquals(exp, out, 0);
    }

}
