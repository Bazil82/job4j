package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        MultiMax check = new MultiMax();
        int max = check.max(first, second, third);

        if (first == max && first > forth) {
            return first;
        } else if (second == max && second > forth) {
            return second;
        } else if (third == max && third > forth) {
            return third;
        } else {
            return forth;
        }
    }
}
