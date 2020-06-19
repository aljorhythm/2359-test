package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Swimmable;

import java.util.function.Consumer;

public class Duck extends Bird implements Swimmable {

    public Duck(Consumer<String> log) {
        super(log);
    }

    void sing() {
        log.accept("Quack, quack");
    }

    public void swim() {
        log.accept("I am swimming");
    }
}