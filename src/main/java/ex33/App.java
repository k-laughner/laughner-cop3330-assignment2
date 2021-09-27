/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex33;
import java.util.Scanner;
import java.util.Random;

class magic8 {

    public void getMagicAnswer(){
        System.out.println("What's your question?");
        Scanner input = new Scanner(System.in);
        String question = input.nextLine();
        int randomNum = getRandomNum();
        print(randomNum);
    }
    public int getRandomNum() {
        int randomNum;
        Random rand = new Random();
        randomNum = rand.nextInt((3-0)+1);
        return randomNum;
    }
    public void print(int randomNum) {
        String[] magicAnswers = {"Yes", "No", "Maybe", "Ask Again Later"};
        System.out.println(magicAnswers[randomNum]);
    }
}
public class App {
    public static void main( String[] args ) {
        magic8 m = new magic8();
        m.getMagicAnswer();
    }
}