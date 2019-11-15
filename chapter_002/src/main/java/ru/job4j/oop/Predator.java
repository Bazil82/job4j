package ru.job4j.oop;

public class Predator extends Animal{
    public Predator() {
        super();
        System.out.println("class Predator");
    }

    public Predator(String name) {
        this.name = name;
        System.out.println("Predator name: " + this.name);
    }
}
