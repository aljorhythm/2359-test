package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.HasSound;

import java.util.function.Consumer;

public class Bird extends Animal implements HasSound {

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
}