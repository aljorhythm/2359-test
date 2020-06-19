package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Flyable;
import io.github.aljorhythm.interfaces.HasSound;
import io.github.aljorhythm.interfaces.Walkable;

import java.util.function.Consumer;

public class Bird extends Animal implements HasSound, Flyable, Walkable {

    public Bird(Consumer<String> log) {
        super(log);
    }

    @Override
    public void fly() {
        this.log.accept("I am flying");
    }

    void sing() {
        this.log.accept(getSound());
    }

    @Override
    public String getSound() {
        return "I am singing";
    }

    @Override
    public void walk() {
        this.log.accept("I am walking");
    }
}