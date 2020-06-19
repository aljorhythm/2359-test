package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.HasSound;
import io.github.aljorhythm.interfaces.Walkable;

import java.util.function.Consumer;

public class Bird extends Animal implements HasSound, Walkable {

    public Bird(Consumer<String> log) {
        super(log);
    }

    void fly() {
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