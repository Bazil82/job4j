package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double halfPer = (a + b + c) / 2;
        return Math.sqrt(halfPer * (halfPer - a) * (halfPer - b) * (halfPer - c));
    }

    public static void main(String[] args){
        double res = TrgArea.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + res);
    }

}
