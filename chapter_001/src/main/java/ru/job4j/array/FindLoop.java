package ru.job4j.array;

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = Min.findMin(data, i, data.length-1);
            if (min < data[i]) {
                int index = FindLoop.indexOf(data, min, i, data.length-1);
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
        }
        return data;
    }
}
