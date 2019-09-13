package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        if (left > right) {
            condition = true;
        } else {
            condition = false;
        }
        int result = condition ? left : right;
        return result;
    }
}
