package io.github.aljorhythm;


import io.github.aljorhythm.enums.Size;
import io.github.aljorhythm.interfaces.CanMakeJokes;

import java.awt.*;
import java.util.function.Consumer;

public class Clownfish extends Fish implements CanMakeJokes {

    Size size;
    Color color;

    public Clownfish(Consumer<String> log) {
        super(log);
        this.size = Size.SMALL;
        this.color = Color.ORANGE;
    }

    @Override
    public void makeJoke() {
        this.log.accept("I am making jokes");
    }
}