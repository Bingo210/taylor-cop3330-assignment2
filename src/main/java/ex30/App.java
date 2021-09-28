/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex30;

public class App {

    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                if (i > 1)
                    System.out.println(i * j);
                else
                    System.out.println(j);
            }

            System.out.println("\n");
        }
    }
}
