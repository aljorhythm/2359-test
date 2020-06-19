package io.github.aljorhythm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class RoosterTest {
    @Test
    void roosterSing_shouldCockadoodle() {
        List<String> outputs = new ArrayList<String>();
        Rooster rooster = new Rooster(outputs::add);
        rooster.sing();
        assertEquals(Arrays.asList("Cock-a-doodle-doo"), outputs);
    }

    @Test
    void anotherRoosterModel() {
        Chicken rooster = new Chicken(System.out::println) {
            void sing() {
                log.accept("Cock-a-doodle-doo");
            }
        };
        rooster.sing();
    }
}