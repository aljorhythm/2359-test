package io.github.aljorhythm;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTest {
    @Test
    void parrotSingNearChicken_shouldCluck() {
        List<String> outputs = new ArrayList<>();
        Chicken chicken = new Chicken(null);
        Parrot parrot = new Parrot(outputs::add, chicken);
        parrot.sing();
        assertEquals(Arrays.asList("Cluck, cluck"), outputs);
    }

    @Test
    void birdFly_shouldFly() {
        List<String> outputs = new ArrayList<>();
        Bird bird = new Bird(outputs::add);
        bird.fly();
        assertEquals(Arrays.asList("I am flying"), outputs);
    }
}