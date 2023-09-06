package org.example;

import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Dice player1 = new Dice("player1");
        Dice player2 = new Dice("player2");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Welcome to Dice Roller!");
        System.out.println("Would you like to play: Yes/No ?");
        String playGame = myScanner.nextLine();

        if (playGame.equalsIgnoreCase("yes")) {
            int roll1 = player1.roll();
            int roll2 = player2.roll();

            int counter = 1;

            while (roll1 != roll2) {
                roll2 = player2.roll();
                counter = counter + 1;
            }
            if (roll2 == roll1) {
                System.out.println("You have a match!");
                System.out.println("It took " + counter + " " + "roll(s)!");
            } else if (playGame.equalsIgnoreCase("no")) {
                System.out.println("No problem, have a nice day.");
            }
        }
    }
}