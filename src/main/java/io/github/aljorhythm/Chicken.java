package io.github.aljorhythm;

import io.github.aljorhythm.exceptions.InvalidBehaviorException;
import java.util.function.Consumer;

public class Chicken extends Bird {

    public Chicken(Consumer<String> log) {
        super(log);
    }

    public String getSound() {
        return "Cluck, cluck";
    }

    void fly() {
        throw new InvalidBehaviorException();
    }
}