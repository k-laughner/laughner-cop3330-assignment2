/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex37;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

class intInput {
    // method that gets integer input
    int getInput() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
class getRandomFromList {
    // method to get a random special character from an array list of special characters
    public String getRandomSpecialCharacter() {
        // creating special characters list
        ArrayList<String> speciallist = new ArrayList<>();
        speciallist.add("!");
        speciallist.add("@");
        speciallist.add("#");
        speciallist.add(".");
        speciallist.add("$");
        speciallist.add("*");
        speciallist.add("-");
        speciallist.add("+");

        int index = new Random().nextInt(speciallist.size());
        String text = speciallist.get(index);
        return text;
    }
    // method to get a random number
    public String getRandomNumber() {
        Random rand = new Random();
        String number = String.valueOf(rand.nextInt(10));
        return number;
    }
    // method to get a random letter
    public String getRandomChar() {
        Random rand = new Random();
        String c = Character.toString(rand.nextInt(26)+'a');
        return c;
    }
    // adds all necessary characters to a string array list
    // then shuffles the array and converts to string
    public String generateRandomPassword(int length, int numbers, int specChar) {
        ArrayList<String> password = new ArrayList();
        String pass = "";
        for (int i = 0; i < numbers; i++) {
            password.add(getRandomNumber());
        }
        for (int j = 0; j < specChar; j++) {
            password.add(getRandomSpecialCharacter());
        }
        if (length-(numbers+specChar) < numbers+specChar) {
            for (int k = 0; k < numbers+specChar; k++) {
                password.add(getRandomChar());
            }
        }
        else {
            for (int k = 0; k < length-(numbers+specChar); k++){
                password.add(getRandomChar());
            }
        }
        // Shuffling the array
        Collections.shuffle(password);

        // Adding string array list contents to a string
        for (String p : password) {
            pass += p;
        }
        return pass;
    }
}
public class App {
    public static void main( String[] args ){
        intInput n = new intInput();
        System.out.println("What's the minimum length?");
        int length = n.getInput();

        System.out.println("How many special characters?");
        int specChar = n.getInput();

        System.out.println("How many numbers?");
        int numbers = n.getInput();

        getRandomFromList g = new getRandomFromList();
        System.out.println("Your password is " + g.generateRandomPassword(length, numbers, specChar));
    }
}
