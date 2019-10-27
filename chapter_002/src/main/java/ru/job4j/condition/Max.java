package ru.job4j.condition;

public class Max {

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int max(int a, int b, int c) {
        if (a > max(b, c)) {
            return a;
        } else if (b > max(a, c)) {
            return b;
        } else {
            return c;
        }
    }

    public int max(int a, int b, int c, int d) {
        if (a > max(b, c, d)) {
            return a;
        } else if (b > max(a, c, d)) {
            return b;
        } else if (c > max(a, b, d)) {
            return c;
        } else {
            return d;
        }

    }

}
