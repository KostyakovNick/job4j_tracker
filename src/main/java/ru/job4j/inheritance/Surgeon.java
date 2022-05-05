package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private String specializations;

    public Surgeon(String name, String surname, String education, String birthday, int qualification, String specializations) {
        super(name, surname, education, birthday, qualification);
        this.specializations = specializations;
    }

    public String getSpecializations() {
        return specializations;
    }
}
