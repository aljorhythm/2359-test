package io.github.aljorhythm;

import java.util.function.Consumer;

public class Dog extends Animal {

    public Dog(Consumer<String> log) {
        super(log);
    }

}