/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex32;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    int guess;
    int guesses;
    public void startGame() {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter the difficulty level (1, 2, 3):");
        int dif = input.nextInt();
        game(dif);
    }
    public void game(int difficulty) {
        if (difficulty == 1) {
            dif1();
        }
        else if (difficulty == 2) {
            dif2();
        }
        else if (difficulty == 3) {
            dif3();
        }
    }
    public void dif1() {
        int randomNum = getRandom(10,1);
        System.out.println("I have my number. What's your guess?");
        getGuess();
        validateGuess(randomNum);
        print();
        playAgain();
    }
    public void dif2(){
        int randomNum = getRandom(100, 1);
        System.out.println("I have my number. What's your guess?");
        getGuess();
        validateGuess(randomNum);
        print();
        playAgain();
    }
    public void dif3(){
        int randomNum = getRandom(1000, 1);
        System.out.println("I have my number. What's your guess?");
        getGuess();
        validateGuess(randomNum);
        print();
        playAgain();
    }

    public int getRandom(int max, int min) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max-min)+1)+min;
        return randomNum;
    }

    public void getGuess(){
        try {
            Scanner input = new Scanner(System.in);
            guess = input.nextInt();
            guesses++;
        }
        catch (InputMismatchException fe) {
            guesses++;
        }
    }

    public void validateGuess(int randomNum){
        do {
            if (guess > randomNum){
                System.out.println("Too high. Guess again: ");
                getGuess();
            }
            else if(guess < randomNum){
                System.out.println("Too low. Guess again:");
                getGuess();
            }
        }
        while (guess != randomNum);
    }

    public void print(){
        System.out.println("You got it in " + guesses + " guesses!");
    }

    public void playAgain(){
        System.out.println("Do you want to play again? Enter 'Y' for yes or 'N' for no.");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (answer.equals("y") || answer.equals("Y")){
            guesses = 0;
            startGame();
        }
    }
}

public class App {
    public static void main( String[] args ) {
        GuessingGame g = new GuessingGame();
        g.startGame();
    }
}