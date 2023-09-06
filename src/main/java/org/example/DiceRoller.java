package org.example;

public class DiceRoller {
    public static void main(String[] args) {

        Dice player1 = new Dice("player1");
        Dice player2 = new Dice("player2");
        int roll1 = player1.roll();
        int roll2 = player2.roll();

        
        while (roll1 != roll2) {
            roll2 = player2.roll();
        }
        if (roll2 == roll1) {
            System.out.print("You have a match!");
        }

    }
}