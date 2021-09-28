/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex31;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int flag1 = 1, flag2 = 1;
        float intensity = 0;

        System.out.println("What is your age?");
        String age = input.next();

        while (flag1 == 1) {
            for (int i = 0; i < age.length(); i++) {
                if (Character.isLetter(age.charAt(i))) {
                    System.out.println("Sorry. That's not a valid input.");
                    System.out.println("What is your age?");
                    age = input.next();
                }
                else
                    flag1 = 0;
            }
        }

        System.out.println("What is your resting heart rate?");
        String heartRate = input.next();

        while (flag2 == 1) {
            for (int i = 0; i < heartRate.length(); i++) {
                if (Character.isLetter(heartRate.charAt(i))) {
                    System.out.println("Sorry. That's not a valid input.");
                    System.out.println("What is your resting heart rate?");
                    heartRate = input.next();
                }
                else
                    flag2 = 0;
            }
        }

        int userAge = Integer.parseInt(age);
        int userRate = Integer.parseInt(heartRate);
        float TargetHeartRate;
        System.out.println("Resting Pulse: " + userRate + "\t\t" + "Age: " + userAge + "\n");
        System.out.println("Intensity\t|  Rate");
        System.out.println("----------------------");

        for (intensity = 55; intensity <= 95; intensity += 5) {
            TargetHeartRate = (((220 - (float)userAge) - (float)userRate) * (intensity / 100)) + (float)userRate;
            System.out.println((int)intensity + "%\t\t    |  " + (int)TargetHeartRate + " bpm");
        }
    }
}