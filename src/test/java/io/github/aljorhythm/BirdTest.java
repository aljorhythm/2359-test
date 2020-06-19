package io.github.aljorhythm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class BirdTest {
    @Test
    void birdSing_shouldSing() {
        List<String> outputs = new ArrayList<String>();
        Bird bird = new Bird(outputs::add);
        bird.sing();
        assertEquals(Arrays.asList("I am singing"), outputs);
    }

    @Test
    void birdFly_shouldFly() {
        List<String> outputs = new ArrayList<String>();
        Bird bird = new Bird(outputs::add);
        bird.fly();
        assertEquals(Arrays.asList("I am flying"), outputs);
    }
}