package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int res = forth;
        if(first > second) {
            if (first > third) {
                if (first > forth) {
                    res = first;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                res = second;
            }
        } else if (third > forth) {
            res = third;
        }
        return res;
    }
}
