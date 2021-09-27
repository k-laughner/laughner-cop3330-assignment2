/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex24;
import java.util.Scanner;
import java.util.Arrays;

class anagramChecker {
    private int n1;
    private int n2;
    private char[] str1;
    private char[] str2;

    // isAnagram function to check if the inputted strings are anagrams
    public boolean isAnagram(String word1, String word2){
        n1 = word1.length();
        n2 = word2.length();
        // converts inputted strings to char arrays
        str1 = word1.toCharArray();
        str2 = word2.toCharArray();
        if (n1 != n2){
            return false;
        }
        else {
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1, str2)){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

class App {
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.println("Enter the first string:");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();

        System.out.println("Enter the second string:");
        Scanner input2 = new Scanner(System.in);
        String str2 = input2.nextLine();

        // calling on isAnagram function to process the inputted strings with boolean return type to print output message
        anagramChecker c;
        c = new anagramChecker();
        if (c.isAnagram(str1, str2)){
            System.out.println("The two words " + str1 + " and "+ str2 +" are anagrams.");
        }
        else{
            System.out.println("The two words " + str1 + " and " + str2 +" are not anagrams.");
        }
    }
}
