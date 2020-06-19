package io.github.aljorhythm;

import io.github.aljorhythm.interfaces.Swimmable;

import java.util.function.Consumer;

public class Fish extends Animal implements Swimmable {

    public Fish(Consumer<String> log) {
        super(log);
    }

    @Override
    public void swim() {
        this.log.accept("I am swimming");
    }
}