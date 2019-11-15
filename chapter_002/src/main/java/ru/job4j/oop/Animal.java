package ru.job4j.oop;

public class Animal {
    String name;

    public Animal() {
        super();
        System.out.println("class Animal");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal name: " + this.name);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Barsik");
    }
}
