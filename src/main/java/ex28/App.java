/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex28;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] userArray = new double[5];
        double sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            userArray[i] = input.nextDouble();
            sum += userArray[i];
        }

        System.out.println("The total is " + sum + ".");
    }
}