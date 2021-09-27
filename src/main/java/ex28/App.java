/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex28;
import java.util.Scanner;
class Add5Numbers {
    // gets 5 int inputs
    public int[] get() {
        int[] numbers = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    // adds 5 ints
    public int add(int[] numbers){
        int total = 0;
        for (int i =0; i<5; i++){
            total = total + numbers[i];
        }
        return total;
    }
}
public class App
{
    public static void main(String[] args) {
        Add5Numbers a = new Add5Numbers();
        int[] nums = a.get();
        int total = a.add(nums);

        System.out.println("The total is " + total + ".");
    }
}