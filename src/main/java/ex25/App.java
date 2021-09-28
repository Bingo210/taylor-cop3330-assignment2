/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex25;

import java.util.Scanner;

public class App {

    // function to find password strength and return a representative integer value
    public static int passwordValidator(String password) {
        int userLetters = 0, userNumbers = 0, userSpecials = 0, result = 0;
        char[] userPassword = password.toCharArray();
        int userLength = userPassword.length;

        // declares char arrays to compare users array to
        // char specials array can not contain " or escape character \
        // arrays must all be the same length, 30 in this case, so repeat elements were added
        char[] numbers = "123456789999999999999999999999".toCharArray();
        char[] letters = "abcdefghijklmnopqrstuvwxyzzzzz".toCharArray();
        char[] specials = "`~!@#$%^&*()-_=+[{]}|;:',<.>/?".toCharArray();

        // traverses each char array to check if user's input matches above arrays at each element
        // increments counter if condition is met on each iteration
        for (int i = 0; i < userLength; i++) {
            for (int j = 0; j < 30; j++){
                if (userPassword[i] == numbers[j])
                    userNumbers++;
                if (userPassword[i] == letters[j])
                    userLetters++;
                if (userPassword[i] == specials[j])
                    userSpecials++;
            }
        }

        // two rules were assumed for program to execute properly
        /*
        * if the password is > 8 but uses all numbers, it is very weak
        * if the password is > 8 but uses all letters, it is weak
        */
        if (userLength >= 8) {
            if (userNumbers == userLength)
                result = 1;
            else if (userLetters == userLength)
                result = 2;
            if (userNumbers > 0 && userLetters > 0 && userSpecials == 0)
                result = 3;
            else if (userNumbers > 0 && userLetters > 0 && userSpecials > 0)
                result = 4;
        }

        if (userLength < 8) {
            if (userNumbers == userLength)
                result = 1;
            else if (userLetters == userLength)
                result = 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;
        String keyword = "filler", singleQuote = "'";

        System.out.println("Enter the password you want checked: ");
        String password = input.next();

        result = passwordValidator(password);

        if (result == 1)
            keyword = "very weak";
        else if (result == 2)
            keyword = "weak";
        else if (result == 3)
            keyword = "strong";
        else if (result == 4)
            keyword = "very strong";

        System.out.println("The password " + singleQuote + password + singleQuote +
                " is a " + keyword + " password.");
    }
}
