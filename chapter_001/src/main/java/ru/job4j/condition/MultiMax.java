package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition = first > second;
        int temp = condition ? first : second;

        return temp > third ? temp : third;
    }
}
