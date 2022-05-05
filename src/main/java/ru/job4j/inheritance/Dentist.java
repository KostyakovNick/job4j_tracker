package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private String classification;

    public Dentist(String name, String surname, String education, String birthday, int qualification, String classification) {
        super(name, surname, education, birthday, qualification);
        this.classification = classification;
    }

    public String getClassification() {
        return classification;
    }
}
