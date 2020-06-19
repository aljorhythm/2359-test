package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Flyable;
import io.github.aljorhythm.interfaces.HasSound;
import io.github.aljorhythm.interfaces.Swimmable;
import io.github.aljorhythm.interfaces.Walkable;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static int[] countAnimalsCategory(List<Animal> list) {
        int flyCount = 0, walkCount = 0, hasSoundCount = 0, swimCount = 0;
        for (Animal animal : list) {
            if (animal instanceof Flyable) {
                flyCount++;
            }
            if (animal instanceof Walkable) {
                walkCount++;
            }
            if (animal instanceof HasSound) {
                hasSoundCount++;
            }
            if (animal instanceof Swimmable) {
                swimCount++;
            }
        }
        return new int[]{
                flyCount, walkCount, hasSoundCount, swimCount
        };
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
