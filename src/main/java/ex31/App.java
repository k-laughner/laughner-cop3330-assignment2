/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex31;
import java.util.Scanner;
class heartRate {
    // method to calculate target heart rate with age and rate inputs
    public double[] calculate(int age, int rate) {
        double target;
        int count=0;
        double[] t = new double[9];
        System.out.println("Intensity | Rate");
        System.out.println("----------|------");
        for(double i = 0.55; i< 0.96; i+=0.05) {
            target = Math.round(((((220 - age) - rate) * i) + rate));
            t[count] = target;
            System.out.printf("   %.0f%%    | %.0f \n",i*100,t[count]);
            count++;
        }
        return t;
    }
}
public class App
{
    public static void main( String[] args )
    {
        System.out.println("Enter you resting pulse:");
        Scanner input = new Scanner(System.in);
        int resting = input.nextInt();

        System.out.println("Enter your age:");
        Scanner input2 = new Scanner(System.in);
        int age = input2.nextInt();

        heartRate h = new heartRate();
        h.calculate(age, resting);
    }
}