package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double h = (p/2)/(k+1);
        double L = h * k;
        return L * h;
    }

    public static void main(String[] args) {
        double res1 = square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + res1);

        double res2 = square(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + res2);
    }
}
