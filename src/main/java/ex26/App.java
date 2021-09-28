/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex26;

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your balance?");
        double b = (Math.ceil(input.nextDouble() * 100)) / 100;
        System.out.println("What is the APR on the card (as a percent)?");
        double apr = input.nextDouble();
        System.out.println("What is the monthly payment you can make?");
        double p = (Math.ceil(input.nextDouble() * 100)) / 100;

        double i = (apr / 100) / 365;

        PaymentCalculator userValues = new PaymentCalculator(i, b, p);

        double n = Math.ceil(userValues.calculateMonthsUntilPaidOff());

        System.out.println("It will take you " + n + " months to pay off this card.");
    }
}
