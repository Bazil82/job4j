package ru.job4j.oop;

public class Engineer extends Profession {

    private int projects;

    Engineer() {}

    Engineer(int projects) {
        this.projects = projects;
    }

    public int getProjects() {
        return projects;
    }
}
