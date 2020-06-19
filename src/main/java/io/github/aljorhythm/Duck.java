package io.github.aljorhythm;

import java.util.function.Consumer;

public class Duck extends Bird {

    public Duck(Consumer<String> log) {
        super(log);
    }

    void sing() {
        log.accept("Quack, quack");
    }

    void swim() {
        log.accept("I am swimming");
    }
}