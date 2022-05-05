package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Костяков Николай Николаевич");
        student.setGroup("38");
        student.setAdmission(new Date());
        System.out.println(student.getFio());
        System.out.println(student.getGroup());
        System.out.println(student.getAdmission());
    }
}
