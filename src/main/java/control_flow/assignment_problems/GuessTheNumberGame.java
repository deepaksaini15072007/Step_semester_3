package control_flow.assignment_problems;

import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret number: ");
        int secretNumber = sc.nextInt();

        System.out.print("Enter maximum tries: ");
        int maxTries = sc.nextInt();

        int[] guesses = new int[maxTries];

        for (int i = 0; i < maxTries; i++) {
            System.out.print("Enter guess " + (i + 1) + ": ");
            guesses[i] = sc.nextInt();
        }

        int tries = 0;
        boolean guessed = false;

        while (tries < maxTries && !guessed) {

            int guess = guesses[tries];

            if (guess > secretNumber) {
                System.out.println("Too high");
            } else if (guess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("Correct! You guessed it");
                guessed = true;
                break;
            }

            tries++;
        }

        if (!guessed) {
            System.out.println("Out of tries — the number was " + secretNumber);
        }

        sc.close();
    }
}