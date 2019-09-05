package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in1 = 140;
        int out1 = rubleToEuro(in1);
        int exp1 = 2;
        boolean passed1 = exp1 == out1;
        System.out.println("140 rubles are 2. Test result: " + passed1);

        int in2 = 280;
        int out2 = rubleToDollar(in2);
        int exp2 = 4;
        boolean passed2 = exp2 == out2;
        System.out.println("280 rubles are 4. Test result: " + passed2);

        int in3 = 40;
        int out3 = euroToRuble(in3);
        int exp3 = 2800;
        boolean passed3 = exp3 == out3;
        System.out.println("40 euro are 2800. Test result: " + passed3);

        int in4 = 50;
        int out4 = dollarToRuble(in4);
        int exp4 = 3000;
        boolean passed4 = exp4 == out4;
        System.out.println("50 dollar are 3000. Test result: " + passed4);
    }
}
