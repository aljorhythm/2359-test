package io.github.aljorhythm;

public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird(System.out::println);
        bird.walk();
        bird.fly();
        bird.sing();
    }
}