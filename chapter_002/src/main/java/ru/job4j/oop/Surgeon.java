package ru.job4j.oop;

public class Surgeon extends Doctor {

    private int scalpel;

    Surgeon() {}

    Surgeon(int scalpel) {
        this.scalpel = scalpel;
    }

    public int getScalpel() {
        return scalpel;
    }

}
