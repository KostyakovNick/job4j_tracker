package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProductLabelTest {
    @Test
    public void generateLabels() {
        List<Product> products = List.of(
                new Product("Cheese", 300, new GregorianCalendar(2022, Calendar.JUNE, 30)),
                new Product("Bread", 50, new GregorianCalendar(2022, Calendar.JUNE, 25)),
                new Product("Sausage", 500, new GregorianCalendar(2022, Calendar.JULY, 26)),
                new Product("Milk", 100, new GregorianCalendar(2022, Calendar.JUNE, 24))
        );
        List<String> expected = List.of(
                "------------------\nBread\nOld price: 50.0\nNew price: 45.0\n------------------",
                "------------------\nMilk\nOld price: 100.0\nNew price: 90.0\n------------------"
        );
        assertThat(ProductLabel.generateLabels(products), is(expected));
    }

}