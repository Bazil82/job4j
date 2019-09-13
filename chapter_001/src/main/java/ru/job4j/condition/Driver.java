package ru.job4j.condition;

public class Driver {
    private char licence = 'N';

    public void passExamOn(char category) {
        this.licence = category;
    }

    public boolean hasLicense() {
        return this.licence =='A' || this.licence == 'B' || this.licence == 'C';
    }

    public boolean canDrive(char category) {
        return this.licence == category;
    }
}
