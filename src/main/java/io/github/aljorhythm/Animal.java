package io.github.aljorhythm;

import java.util.function.Consumer;

public class Animal {
    Consumer<String> log;

    public Animal(Consumer<String> log) {
        this.log = log;
    }

    void walk() {
        this.log.accept("I am walking");
    }
}