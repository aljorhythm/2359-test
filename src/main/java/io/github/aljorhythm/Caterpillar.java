package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Flyable;
import io.github.aljorhythm.interfaces.Walkable;

import java.util.function.Consumer;

public class Caterpillar extends Animal implements Walkable {

    public Caterpillar(Consumer<String> log) {
        super(log);
    }

    @Override
    public void walk() {
        this.log.accept("I am walking");
    }

    public Butterfly morph() {
        return new Butterfly(this.log);
    }
}