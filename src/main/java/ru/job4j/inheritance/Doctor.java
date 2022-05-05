package ru.job4j.inheritance;

public class Doctor extends Profession {

    private int qualification;

    Diagnosis astma = new Diagnosis("Астма");

    public Doctor(String name, String surname, String education, String birthday, int qualification) {
        super(name, surname, education, birthday);
        this.qualification = qualification;
    }

    public int getQualification() {
        return qualification;
    }

    public Diagnosis heal(Pacient pacient) {
        return astma;
    }
}
