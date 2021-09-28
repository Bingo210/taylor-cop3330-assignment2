/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static int isAnagram(String firstString, String secondString){
        int result = 1;

        if (firstString.length() != secondString.length()) {
            System.out.println("Words must be the same length.");
            result = 0;
        }
        else {
            char[] array1 = firstString.toCharArray();
            char[] array2 = secondString.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            for (int i = 0; i < firstString.length(); i++) {
                if (array1[i] != array2[i])
                    result = 0;
            }
        }

        return result;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        int anaCheck;
        char quote = '"';

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        String firstString = input.next();
        System.out.println("Enter the second string: ");
        String secondString = input.next();

        anaCheck = isAnagram(firstString, secondString);

        if (anaCheck == 1) {
            System.out.println(quote + firstString + quote + " and " + quote + secondString +
                   quote + " are anagrams.");
        }
        else {
            System.out.println(quote + firstString + quote + " and " + quote + secondString +
                    quote + " are not anagrams.");
        }
    }
}
