/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Noah Taylor
 */

package ex26;

public class PaymentCalculator {

    double i;
    double b;
    double p;

    public PaymentCalculator(double i, double b, double p ) {
        this.i = i;
        this.b = b;
        this.p = p;
        }

        public double calculateMonthsUntilPaidOff() {
        return -(1.0 / 30) * (Math.log(1 + (this.b / this.p) *
                    (1 - Math.pow(1 + this.i,30)))) / Math.log(1 + this.i);
        }
    }
