package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean res = true;
        for (int i = 0; i < data.length - 1; i++) {
            boolean temp = data[i + 1];
            if (data[i] != temp) {
                res = false;
                break;
            }
        }
        return res;
    }
}
