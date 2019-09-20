package ru.job4j.calculator;

/**
 *Class Calculator решение задачи части 001 урок1.
 * @author Vasiliy Kozlov
 * @sience 01.09.2019
 */

public class Calculator {
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void subtrack(double first, double second) {
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Метод для тестирования.
     * @param args
     */

    public static void main(String[] args) {
        add(1, 1);
        subtrack(3, 1);
        div(4, 2);
        multiply(2, 2);
    }
}
