package ru.job4j.condition;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {
    @Test
    public void whenExist() {
        boolean res = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(res, is(true));
    }

    @Test
    public void whenNotExist() {
        boolean res = Triangle.exist(1.0, 20.0, 1.0);
        assertThat(res, is(false));
    }
}
