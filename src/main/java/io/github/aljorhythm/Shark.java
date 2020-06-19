package io.github.aljorhythm;


import io.github.aljorhythm.enums.Size;

import java.awt.*;
import java.util.function.Consumer;

public class Shark extends Fish {

    Size size;
    Color color;

    public Shark(Consumer<String> log) {
        super(log);
        this.size = Size.LARGE;
        this.color = Color.GRAY;
    }

    public void eat(Fish fish) {
        this.log.accept("Eating:  " + fish.toString());
    }
}