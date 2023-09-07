package org.example;

public class Dice {

    private String name;
    private int min = 1;
    private int max = 6;
    private int range = max - min;

    public Dice(String name) {
        this.name = name;
    }

    public int roll() {

        int rollValue = (int) (Math.random() * range) + 1;
        System.out.println(name + " rolled a " + rollValue);
        return rollValue;
    }
}
