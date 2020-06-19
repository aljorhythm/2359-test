package io.github.aljorhythm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    void animalWalk_shouldWalk() {
        List<String> outputs = new ArrayList<String>();
        Animal animal = new Animal(outputs::add);
        animal.walk();
        assertEquals(Arrays.asList("I am walking"), outputs);
    }
}