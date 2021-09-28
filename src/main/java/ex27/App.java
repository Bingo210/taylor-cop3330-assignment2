/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex27;

import java.util.Scanner;

public class App {

    public static String validateInput(boolean validFirst, boolean validLast,
                                        boolean validZip, boolean validID) {
        String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "";

        if(validFirst == true && validLast == true && validZip == true && validID == true)
            s5 = "There were no errors found.\n";
        if (validFirst != true)
            s1 = "The first name must be filled in and at least 2 characters long.\n";
        if (validLast != true)
            s2 = "The last name must be filled in and at least 2 characters long.\n";
        if (validZip != true)
            s3 = "The zipcode must be a 5 digit number.\n";
        if (validID != true)
            s4 = "The employee ID must be in the format of AA-1234.\n";

        return s1 + s2 + s3 + s4 + s5;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        String firstName = input.next();

        System.out.println("Enter the last name: ");
        String lastName = input.next();

        System.out.println("Enter the ZIP code: ");
        String zipCode = input.next();

        System.out.println("Enter the employee ID: ");
        String empID = input.next();

        Validation checkFirstName = new Validation(firstName, zipCode, empID);
        Validation checkLastName = new Validation(lastName, zipCode, empID);
        Validation checkZipCode = new Validation(firstName, zipCode, empID);
        Validation checkEmpID = new Validation(firstName, zipCode, empID);
        boolean validFirst = checkFirstName.checkName();
        boolean validLast = checkLastName.checkName();
        boolean validZip = checkZipCode.checkZip();
        boolean validID = checkEmpID.checkID();

        String result = validateInput(validFirst, validLast, validZip, validID);

        System.out.println(result);
    }
}
