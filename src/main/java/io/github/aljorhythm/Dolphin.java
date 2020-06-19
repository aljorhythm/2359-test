package io.github.aljorhythm;

import java.util.function.Consumer;
import io.github.aljorhythm.interfaces.Swimmable;

public class Dolphin extends Animal implements Swimmable {

    public Dolphin(Consumer<String> log) {
        super(log);
    }

    @Override
    public void swim() {
        this.log.accept("I am swimming");
    }
}
