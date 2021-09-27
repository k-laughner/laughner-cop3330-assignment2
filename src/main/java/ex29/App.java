/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex29;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
class doublingInvestments {
    private int rate;
    String output = "Sorry. That's not a valid input.";
    public int getInput(){
        System.out.println("What is the rate of return?");
        try {
            Scanner input = new Scanner(System.in);
            rate = input.nextInt();
            noZero(rate);
        }
        catch(InputMismatchException fe) {
            System.out.println(output);
            getInput();
        }
        return rate;
    }
    public void noZero(int input){
        if (input == 0) {
            System.out.println(output);
            getInput();
        }
    }
    public double calculate(int rate){
        double years = Math.ceil(72/rate);
        return years;
    }
}
public class App {
    public static void main( String[] args ) {
        doublingInvestments vI = new doublingInvestments();
        double years = vI.calculate(vI.getInput());
        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}