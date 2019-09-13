package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int days = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            days += 1;
        }
        return days;
    }
}
