package ru.job4j.inheritance;

public class Engineer extends Profession{

    private int grade;

    public Engineer(String name, String surname, String education, String birthday, int grade) {
        super(name, surname, education, birthday);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }
}
