package ru.job4j.oop;

import java.util.Date;

public class Doctor extends Profession {

    private Date obtainingLicense;

    Doctor() {}

    Doctor(Date obtainingLicense) {
        this.obtainingLicense = obtainingLicense;
    }

    public Date getObtainingLicense() {
        return obtainingLicense;
    }

}
