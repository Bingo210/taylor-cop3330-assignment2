/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex27;

import java.util.Locale;

public class Validation {
    String Name;
    String zipCode;
    String empID;

    public Validation(String Name, String zipCode, String empID) {
        this.Name = Name;
        this.zipCode = zipCode;
        this.empID = empID;
    }

    public boolean checkName() {
        if (Name.length() >= 2)
            return true;
        else
            return false;
    }

    public boolean checkZip() {
        char[] numbers = "123456789".toCharArray();
        int numOfNumbers = 0;

        if (zipCode.length() != 5)
            return false;

        char[] zipChar = zipCode.toCharArray();

        for (int i = 0; i < zipChar.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (zipChar[i] == numbers[j])
                    numOfNumbers++;
            }
        }

        if (numOfNumbers == 5)
            return true;
        else
            return false;
    }

    public boolean checkID() {
        char[] numbers = "123456789".toCharArray();
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int numLetters = 0, numNumbers = 0;

        if(empID.length() != 7)
            return false;

        String eID = empID.toLowerCase();
        char[] ID = eID.toCharArray();

        for (int i = 0; i < ID.length; i++) {
            if (i < 2) {
                for (int j = 0; j < letters.length; j++) {
                    if (ID[i] == letters[j])
                        numLetters++;
                }
            }
            else if (i == 2) {
                if (ID[i] != '-')
                    return false;
            }
            else {
                for (int j = 0; j < numbers.length; j++) {
                    if (ID[i] == numbers[j])
                        numNumbers++;
                }
            }
        }

        if (numLetters == 2 && numNumbers == 4)
            return true;
        else
            return false;
    }
}
