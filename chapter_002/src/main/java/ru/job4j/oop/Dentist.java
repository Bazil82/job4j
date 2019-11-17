package ru.job4j.oop;

public class Dentist extends Doctor {

    private int denture;

    Dentist() {}

    Dentist(int denture) {
        this.denture = denture;
    }

    public int getDenture() {
        return denture;
    }

}
