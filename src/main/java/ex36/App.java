/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex36;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

class Stats{
    // method to get input until user types done
    public ArrayList getInput(){
        ArrayList <Integer> numbers = new ArrayList<Integer>();
        String number;
        String done = "n";
        try{
            do {
                System.out.println("Enter a number:");
                Scanner input = new Scanner(System.in);
                number = input.nextLine();

                if(number.equals("done")) {
                    done = "y";
                }
                else if(Integer.parseInt(number) > 0 || Integer.parseInt(number) < 0) {
                    int num = Integer.parseInt(number);
                    numbers.add(num);
                }
            } while(done.equals("n"));
        }
        catch (NumberFormatException fe){
            System.out.println("Sorry. This is not valid input. Please enter an integer or type 'done' to indicate you are done entering numbers.");
            getInput();
        }
        return numbers;
    }
    // method to get size of arrayList
    public int getCount(ArrayList <Integer> numbers) {
        int count = numbers.size();
        return count;
    }
    // method to find average of numbers in an arrayList
    public float average(ArrayList <Integer> numbers, int count){
        int sum = 0;
        for(int i = 0; i<count; i++){
            sum = sum + numbers.get(i);
        }
        float average = sum/count;
        return average;
    }
    // method to find the max of numbers in an array list
    public int max(ArrayList <Integer> numbers){
        int max = Collections.max(numbers);
        return max;
    }
    // method to find the min of numbers in an array list
    public int min(ArrayList <Integer> numbers){
        int min = Collections.min(numbers);
        return min;
    }
    // method to find the std of numbers in an array list
    public double std(ArrayList <Integer> numbers, int count){
        float average = average(numbers, count);
        double term = 0;
        for (int i=0; i < count; i++){
            term = term + Math.pow((numbers.get(i)-average), 2);
        }
        double finalTerm = Math.sqrt(term/count);
        return (double) Math.round(finalTerm*100)/100;
    }
    // calls all the functions to retrieve the stats of an array list
    public void all(){
        ArrayList <Integer> numbers = getInput();
        int count = getCount(numbers);
        System.out.printf("The average is %.2f.\n", average(numbers, count));
        System.out.printf("The maximum is %d.\n", max(numbers));
        System.out.printf("The minimum is %d.\n", min(numbers));
        System.out.printf("The standard deviation is %.2f\n", std(numbers, count));
    }
}
public class App
{
    public static void main( String[] args ) {
        Stats s = new Stats();
        s.all();
    }
}