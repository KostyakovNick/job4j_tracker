package ru.job4j.inheritance;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Nick","Kostyakov", "higher education", "28.09.1981");
        Programmer programmer = new Programmer("","1234","1111","21.05.19990");
        System.out.println(programmer.getName() + " " + doctor.diagnosisHeal(programmer));
    }
}
