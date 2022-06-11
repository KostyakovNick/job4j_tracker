package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс модели пользователя банка
 * @author NIKOLAY KOSTYAKOV
 * @version 1.0
 */
public class User {

    /**
     * Хранение данных пользователя (данные паспорта и ФИО) осуществляется объектами типа String
     */
    private String passport;
    private String username;

    /**
     * Конструктор класса Account
     * @param passport данные паспорта пользователя банка
     * @param username ФИО пользователя банка
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     *Метод геттер
     * @return passport данные паспорта пользователя банка
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод сеттер
     * @param passport данные паспорта пользователя банка
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     *Метод геттер
     * @return username ФИО пользователя банка
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод сеттер
     * @param username ФИО пользователя банка
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Преодпределение метода equals() класса Object
     * метод сравнивает пользователя банка по паспорту
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Преодпределение метода hashCode() класса Object
     *  метод сравнивает пользователя банка по паспорту
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}