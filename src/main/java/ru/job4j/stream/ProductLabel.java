package ru.job4j.stream;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class ProductLabel {

    public static List<String> generateLabels(List<Product> products) {
        return products.stream()
                .filter(product -> (
                        (product.getExpired().getTimeInMillis()
                                - Calendar.getInstance().getTimeInMillis()
                        )
                        <= 172800000)
                )
                .map(s -> "------------------" + System.lineSeparator()
                        + s.getName() + System.lineSeparator()
                        + "Old price: " + s.getPrice() + System.lineSeparator()
                        + "New price: " + (s.getPrice() * 0.9) + System.lineSeparator()
                        + "------------------")
                .collect(Collectors.toList());
    }
}