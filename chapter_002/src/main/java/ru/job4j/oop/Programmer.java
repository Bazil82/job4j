package ru.job4j.oop;

public class Programmer extends Engineer {

    private int commits;

    Programmer() {}

    Programmer(int commits) {
        this.commits = commits;
    }

    public int getCommits() {
        return commits;
    }

}
