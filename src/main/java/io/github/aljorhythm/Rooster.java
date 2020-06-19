package io.github.aljorhythm;

import java.util.function.Consumer;

public class Rooster extends Chicken {

    public Rooster(Consumer<String> log) {
        super(log);
    }

    void sing() {
        log.accept("Cock-a-doodle-doo");
    }
}