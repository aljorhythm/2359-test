package io.github.aljorhythm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.github.aljorhythm.exceptions.InvalidBehaviorException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ChickenTest {
    @Test
    void chickenSing_shouldCluck() {
        List<String> outputs = new ArrayList<String>();
        Chicken chicken = new Chicken(outputs::add);
        chicken.sing();
        assertEquals(Arrays.asList("Cluck, cluck"), outputs);
    }

    @Test()
    void chickenFly_shouldFail() {
        Chicken chicken = new Chicken(null);
        assertThrows(InvalidBehaviorException.class, chicken::fly);
    }
}