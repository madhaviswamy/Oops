package org.example;

public class NextRoll {

    public int nextRoll() {
        int min = 1;
        int max = 6;
        int range = max - min;
        int roll2= (int) (Math.random() * range) + 1;
        System.out.println("Current roll = " + roll2);
        return roll2;

    }
}
