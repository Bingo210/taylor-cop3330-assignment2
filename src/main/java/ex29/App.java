/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag = 1;

        System.out.println("What is the rate of return?");
        String r = input.next();

        if (r.length() == 1) {
            while (r.equals("0")) {
                System.out.println("Sorry. That's not a valid input.");
                System.out.println("What is the rate of return?");
                r = input.next();
            }
        }

        while (flag == 1) {
            for (int i = 0; i < r.length(); i++) {
                if (Character.isLetter(r.charAt(i))) {
                    System.out.println("Sorry. That's not a valid input.");
                    System.out.println("What is the rate of return?");
                    r = input.next();
                }
                else
                    flag = 0;
            }
        }

        double rate = Integer.parseInt(r);
        double years = Math.ceil(72.0 / rate);

        System.out.println("It will take " + (int)years + " years to " +
                "double your initial investment.");
    }
}
