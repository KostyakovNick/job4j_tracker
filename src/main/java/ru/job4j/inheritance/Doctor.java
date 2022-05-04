package ru.job4j.inheritance;

public class Doctor extends Profession{

    private String diagnosis;
    private String pacient;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public String diagnosisHeal(Programmer programmer) {
        return "The patient is healthy";
    }
}
