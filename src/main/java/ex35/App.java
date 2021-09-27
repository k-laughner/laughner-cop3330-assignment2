/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class pickWinner {
    public List getInput(){
        String name;
        List <String> names = new ArrayList<>();
        do {
            System.out.println("Enter a name: ");
            Scanner input = new Scanner(System.in);
            name = input.nextLine();
            if(!name.trim().isEmpty()){
                names.add(name);
            }
        } while(!name.trim().isEmpty());
        return names;
    }
    public int getCount(List <String> names) {
        int count = names.size();
        return count;
    }
    public int getRandomNum(int count){
        Random rand = new Random();
        int randomNum = rand.nextInt(((count-1)-0)+1);
        return randomNum;
    }
    public void pickWinner(List <String> names, int randomNum) {
        System.out.println("The winner is......" + names.get(randomNum) +"!");
    }
    public void startPicker(){
        List <String> names = getInput();
        int randomNum = getRandomNum(names.size());
        pickWinner(names, randomNum);
    }
}
public class App
{
    public static void main( String[] args ) {
        pickWinner p = new pickWinner();
        p.startPicker();
    }
}