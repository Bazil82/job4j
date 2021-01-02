package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
            }
        }
        return min;
    }

    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (array[i + 1] < min) {
                min = array[i + 1];
            }
        }
        return min;
    }
}
