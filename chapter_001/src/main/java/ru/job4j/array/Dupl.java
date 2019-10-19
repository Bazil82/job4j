package ru.job4j.array;

public class Dupl {
    public int[] dupl(int[] left, int[] right) {
        int[] inter = new int[left.length + right.length];
        int index = 0;
        for (int i = 0; i < left.length; i++) {
            int a = left[i];
            for (int j = 0; j < right.length; j++) {
                if (a == right[j]) {
                    inter[index] = a;
                    index++;
                    break;
                }
            }
        }

        int[] res = new int[index];
        int count = 0;
        for (int k : inter) {
            if (k != 0) {
                res[count] = k;
                count++;
            }
        }

        return res;
    }
}
