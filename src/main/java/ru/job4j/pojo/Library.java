package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Психология масс", 591);
        Book book2 = new Book("Валериан и город тысячи планет", 313);
        Book book3 = new Book("Портрет Дориана Грея", 320);
        Book book4 = new Book("Госпожа Бовари", 384);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        Book book = new Book("Clean code", 0);
        books[1] = book;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        Book tmp = books[3];
        books[3] = books[0];
        books[0] = tmp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }
    }
}