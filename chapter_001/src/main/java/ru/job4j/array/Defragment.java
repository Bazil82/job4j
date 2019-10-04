package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        String temp;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp = array[count];
                array[count] = array[i];
                array[i] = temp;
                count++;
            }
        }
        return array;
    }
}
