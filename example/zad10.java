package org.example;
import java.util.Scanner;

public class zad10 {
    public static void main(String[] args) {
        int secretNum = drawNumber();
        int guessCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number (between 0 and 100):");

        while (true) {
            int userGuess = scanner.nextInt();
            guessCount++;

            if (userGuess < secretNum) {
                System.out.println("The number is greater. Guess count: " + guessCount);
            } else if (userGuess > secretNum) {
                System.out.println("The number is lesser. Guess count: " + guessCount);
            } else {
                System.out.println("Congratulations, your guess is correct!Number of guesses: " + guessCount);

                break;
            }
        }


    }

    public static int drawNumber() {
        return (int) (Math.random() * 101);
    }
}
