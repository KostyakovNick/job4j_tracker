package ru.job4j.stream;

import java.util.stream.Stream;

public class Cards {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        Stream.of(suits)
                .flatMap(value -> Stream.of(values)
                        .map(suit -> suit   + " " + value))
                .forEach(System.out::println);
    }
}
