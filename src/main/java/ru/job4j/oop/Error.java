package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка: " + active);
        System.out.println("Код: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println();
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error400 = new Error(true, 400, "Bad Request");
        Error error401 = new Error(true, 401, "Unauthorized");
        Error error102 = new Error(false, 102, "Processing");
        error.printInfo();
        error400.printInfo();
        error401.printInfo();
        error102.printInfo();
    }
}
