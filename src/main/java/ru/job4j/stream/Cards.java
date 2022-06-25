package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cards {
    public static void main(String[] args) {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        Stream.of(suits)
                .flatMap(suit -> Stream.of(values)
                       .map(value -> new Card(suit, value)))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
