package ru.job4j.oop;

public class Tiger extends Predator{
    public Tiger() {
        super();
        System.out.println("class Tiger");
    }

    public Tiger(String name) {
        this.name = name;
        System.out.println("Tiger name: " + this.name);
    }
}
