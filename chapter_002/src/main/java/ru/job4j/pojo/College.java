package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasiliy Kozlov");
        student.setGroup(1);
        student.setDate(new Date());

        System.out.println(student.getName() + " is in a group " + student.getGroup() + " from " + student.getDate());
    }

}
