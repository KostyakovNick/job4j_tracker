package ru.job4j.inheritance;

public class Builder extends Engineer{

    private String speciality;

    public Builder(String name, String surname, String education, String birthday, int grade, String speciality) {
        super(name, surname, education, birthday, grade);
        this. speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }
}
