package io.github.aljorhythm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DuckTest {
    @Test
    void duckSing_shouldQuack() {
        List<String> outputs = new ArrayList<String>();
        Duck duck = new Duck(outputs::add);
        duck.sing();
        assertEquals(Arrays.asList("Quack, quack"), outputs);
    }

    @Test
    void duckSwim_shouldSwim() {
        List<String> outputs = new ArrayList<String>();
        Duck duck = new Duck(outputs::add);
        duck.fly();
        assertEquals(Arrays.asList("I am swimming"), outputs);
    }
}