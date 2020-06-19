package io.github.aljorhythm;

import java.util.function.Consumer;

public class Bird extends Animal {

    public Bird(Consumer<String> log) {
        super(log);
    }

    void fly() {
        this.log.accept("I am flying");
    }

    void sing() {
        this.log.accept("I am Singing");
    }
}