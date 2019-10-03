package ru.job4j.array;

public class ArrayChar {
    public static boolean startsW(char[] world, char[] pref) {
        boolean res = true;
        for (int i = 0; i < pref.length; i++) {
            if (world[i] != pref[i]) {
                res = false;
            }
        }
        return res;
    }
}
