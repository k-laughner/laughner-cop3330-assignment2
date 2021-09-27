/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex38;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;

class getInput {
    // method to get string input
    public String getStringInput() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
class toArray {
    // method to turn input into an array of integers
    public int[] tokenizeInput(String input) {
        StringTokenizer st = new StringTokenizer(input);
        int count = st.countTokens();
        int[] numbers = new int[count];
        for (int i=0; i<count; i++) {
            numbers[i] = Integer.parseInt((String)st.nextElement());
        }
        return numbers;
    }
}
class classifyingNums {
    // method to filter for even numbers
    public int[] filterEvenNumbers(int[] numbers) {
        List <Integer> even = new ArrayList<Integer>();
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even.add(numbers[i]);
            }
        }
        int[] evenArr = new int[even.size()];
        for (int i=0; i<even.size(); i++) {
            evenArr[i] = even.get(i);
        }
        return evenArr;
    }
}
class App {
    public static void main (String[] args) {
        // calling to get input
        System.out.println("Enter a list of numbers, separated by spaces:");
        getInput gi = new getInput();
        String sepInput = gi.getStringInput();

        // calling to turn to integer array
        toArray arr = new toArray();
        int[] array = arr.tokenizeInput(sepInput);

        // calling to filter the integer array
        classifyingNums c = new classifyingNums();
        int[] evenNumbers = c.filterEvenNumbers(array);

        // Printing the results
        System.out.printf("The even numbers are");
        for(int i =0; i< evenNumbers.length; i++) {
            System.out.printf(" %d", evenNumbers[i]);
        }
        System.out.printf(".");
    }
}