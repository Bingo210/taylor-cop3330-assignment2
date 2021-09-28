/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex32;

import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class App {

    public static boolean checkString(char[] userGuess) {
        String guess = Arrays.toString(userGuess);

        for (int i = 0; i < guess.length(); i++) {
            if (Character.isLetter(guess.charAt(i)) ||
                    guess.contains("!#%&'()*+,-./:;<=>?@[]^_`{|}~"))
                return true;
        }
        return false;
    }

        public static void main (String[] args) {
            Scanner input = new Scanner(System.in);
            char userChoice = 'n';

            System.out.println("Let's play Guess the Number!");

            do {
                double randomNum1, randomNum2, randomNum3;
                char[] userGuesses1 = new char[100];
                char[] userGuesses2 = new char[100];
                char[] userGuesses3 = new char[100];
                int numGuess1 = 0, numGuess2 = 0, numGuess3 = 0;

                System.out.println("\nEnter the difficulty level (1, 2, or 3): ");
                int difficulty = input.nextInt();

                if (difficulty == 1) {
                    randomNum1 = (int) (Math.random() * 10);

                    System.out.println("I have my number. What's your guess?");

                    for (int i = 0; i < 100; i++) {
                        userGuesses1[i] = input.next().charAt(0);
                        numGuess1++;

                        if (checkString(userGuesses1)) {
                            System.out.println("That was a non-numerical, but still counted. Guess again: ");
                            userGuesses1[i] = 0;
                        }
                        else if (Character.getNumericValue(userGuesses1[i]) == randomNum1) {
                            System.out.println("You got it in " + numGuess1 + " guesses!");
                            break;
                        }
                        else if (Character.getNumericValue(userGuesses1[i]) > randomNum1) {
                            System.out.println("Too high. Guess again:");
                        }
                        else {
                            System.out.println("Too low. Guess again:");
                        }
                    }

                    System.out.println("\nDo you wish to play again (Y/N)?");
                    userChoice = input.next().charAt(0);

                }
                else if (difficulty == 2) {
                    randomNum2 = (int) (Math.random() * 100);

                    System.out.println("I have my number. What's your guess?");

                    for (int i = 0; i < 100; i++) {
                        userGuesses2[i] = input.next().charAt(0);
                        numGuess2++;

                        if (checkString(userGuesses2)) {
                            System.out.println("That was a non-numerical, but still counted. Guess again: ");
                            userGuesses2[i] = 0;
                        }
                        else if (Character.getNumericValue(userGuesses2[i]) == randomNum2) {
                            System.out.println("You got it in " + numGuess2 + " guesses!");
                            break;
                        }
                        else if (Character.getNumericValue(userGuesses2[i]) > randomNum2) {
                            System.out.println("Too high. Guess again:");
                        }
                        else {
                            System.out.println("Too low. Guess again:");
                        }
                    }

                    System.out.println("\nDo you wish to play again (Y/N)?");
                    userChoice = input.next().charAt(0);

                }
                else if (difficulty == 3) {
                    randomNum3 = (int) (Math.random() * 1000);

                    System.out.println("I have my number. What's your guess?");

                    for (int i = 0; i < 100; i++) {
                        userGuesses3[i] = input.next().charAt(0);
                        numGuess3++;

                        if (checkString(userGuesses3)) {
                            System.out.println("That was a non-numerical, but still counted. Guess again: ");
                            userGuesses3[i] = 0;
                        }
                        else if (Character.getNumericValue(userGuesses3[i]) == randomNum3) {
                            System.out.println("You got it in " + numGuess3 + " guesses!");
                            break;
                        }
                        else if (Character.getNumericValue(userGuesses3[i]) > randomNum3) {
                            System.out.println("Too high. Guess again:");
                        }
                        else {
                            System.out.println("Too low. Guess again:");
                        }
                    }

                    System.out.println("\nDo you wish to play again (Y/N)?");
                    userChoice = input.next().charAt(0);
                }
            } while (userChoice == 'y');
    }
}
