package io.github.aljorhythm;

import java.util.function.Consumer;

public class Cat extends Animal {

    public Cat(Consumer<String> log) {
        super(log);
    }

}