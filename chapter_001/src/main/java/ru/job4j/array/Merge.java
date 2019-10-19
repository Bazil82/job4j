package ru.job4j.array;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int l = 0, r = 0, index = 0;
        int[] rsl = new int[left.length + right.length];
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                rsl[index] = left[l];
                l++;
            } else {
                rsl[index] = right[r];
                r++;
            }
            index++;
        }
        if (l < r) {
            while (l < left.length) {
                rsl[index] = left[l];
                l++;
                index++;
            }
        } else {
            while (r < right.length) {
                rsl[index] = right[r];
                r++;
                index++;
            }
        }
        return rsl;
    }


}
