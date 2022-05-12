package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNegativeNum() {
        Fact.calc(-1);
    }

    @Test
    public void when4To24() {
       int rsl = Fact.calc(4);
       assertThat(rsl, is(24));
    }
}