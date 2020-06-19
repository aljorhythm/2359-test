package io.github.aljorhythm;

import io.github.aljorhythm.exceptions.InvalidBehaviorException;
import io.github.aljorhythm.interfaces.HasSound;

import java.util.function.Consumer;

public class Parrot extends Bird implements HasSound {

    HasSound nearAnimal;

    public Parrot(Consumer<String> log, HasSound nearAnimal) {
        super(log);
        this.nearAnimal = nearAnimal;
    }

    void sing() {
        this.log.accept(getSound());
    }

    public String getSound() {
        if(nearAnimal instanceof HasSound) {
           return this.nearAnimal.getSound();
        }
        return "";
    }

    void has() {
        throw new InvalidBehaviorException();
    }
}