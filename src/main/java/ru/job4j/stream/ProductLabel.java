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
                .map(s -> "------------------\n"
                        + s.getName()
                        + "\nOld price: " + s.getPrice()
                        + "\nNew price: " + (s.getPrice() * 0.9)
                        + "\n------------------")
                .collect(Collectors.toList());
    }
}