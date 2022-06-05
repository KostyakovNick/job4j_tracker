package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ItemDescByNameTest {

    @Test
    public void compare() {
        List<Item> items = Arrays.asList(
                new Item(1, "s"),
                new Item(4, "a"),
                new Item(3, "b"),
                new Item(2, "e")
        );
        List<Item> expected = Arrays.asList(
                new Item(1, "s"),
                new Item(2, "e"),
                new Item(3, "b"),
                new Item(4, "a")
        );
        Collections.sort(items, new ItemDescByName());
        assertThat(items, is(expected));
    }
}