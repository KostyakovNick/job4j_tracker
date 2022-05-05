package ru.job4j.inheritance;

import java.util.Calendar;

public class Profession {

    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }

    public static void main(String[] args) {
         Surgeon surgeon = new Surgeon(
                "James",
                "Stivenson",
                "higher education",
                "20.07.1990",
                4,
                "Pediatric surgery");
        Dentist dentist = new Dentist(
                "Jack",
                "Wales",
                "higher education",
                "15.06.1987",
                2,
                "therapist");
        Programmer programmer = new Programmer(
                "Thomas",
                "Anderson",
                "higher education",
                "30.04.1977",
                7,
                "Java");
        Builder builder = new Builder(
                "Homer",
                "Simson",
                "higher education",
                "28.09.1991",
                9,
                "Architecture");
        Doctor doctor = new Doctor(
                "asdasd",
                "aqweqweqwe",
                "higher education",
                "12.08.2000",
                3);
        Pacient pacient = new Pacient("Micky", "Mouse");
        System.out.println("Программист:  " + programmer.getName() + " " + programmer.getSurname() + ", " + programmer.getBirthday());
        System.out.println("Grade: " + programmer.getGrade() + ", Programming language: " + programmer.getLanguage());
        System.out.println();
        System.out.println("Пациент: " + pacient.getName() + " " + pacient.getSurname());
        System.out.println("Диагноз: " + doctor.heal(pacient).getDiag());
    }
}
