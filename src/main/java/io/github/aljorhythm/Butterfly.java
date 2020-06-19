package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Flyable;
import io.github.aljorhythm.interfaces.HasSound;
import io.github.aljorhythm.interfaces.Walkable;

import java.util.function.Consumer;

public class Butterfly extends Animal implements Flyable {

    public Butterfly(Consumer<String> log) {
        super(log);
    }

    public void fly() {
        this.log.accept("I am flying after metamorphosis");
    }
}