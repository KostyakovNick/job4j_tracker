package ru.job4j.inheritance;

public class Pacient {
    private String name;
    private String surname;

    public Pacient(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
}
