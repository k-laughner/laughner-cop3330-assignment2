/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex26;
import java.util.Scanner;
import java.lang.Math;

class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double b, double apr, double p) {
        double i = (apr / 100) / 365;
        double n = (-1) * Math.pow(30, -1) * Math.log(1 + ((b / p) * (1 - Math.pow((1 + i), 30)))) / Math.log(1 + i);
        double months = Math.ceil(n);

        return months;
    }
}
class App
{
    public static void main( String[] args )
    {
        System.out.println( "What is your balance?");
        Scanner input = new Scanner(System.in);
        float balance = input.nextFloat();

        System.out.println("What is the APR on the card (as a percent)?");
        Scanner input2 = new Scanner(System.in);
        float APR = input2.nextFloat();

        System.out.println("What is the monthly payment you can make?");
        Scanner input3 = new Scanner(System.in);
        float monthlyPayment = input3.nextFloat();

        PaymentCalculator pc = new PaymentCalculator();
        double months = pc.calculateMonthsUntilPaidOff(balance, APR, monthlyPayment);
        System.out.printf("It will take you %.0f months to pay off this card.", months);

    }
}
