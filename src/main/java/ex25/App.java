/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex25;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class passVal {
    private boolean resultNum;
    private boolean resultLet;
    private boolean numberPresent;
    private boolean letterPresent;
    private boolean specChar;

    // method to check if password only contains numbers
    public void passNumber(String password) {
        if (password.matches("[0-9]+")){
            resultNum = true;
        }
    }

    // method to check if password only contains letters
    public void passLetter(String password){
        if (password.matches("[a-zA-Z]+")){
            resultLet = true;
        }
    }

    // method to check if password contains some letters
    public void letters(String password){
        if (password.matches(".*[a-zA-Z]+.*")){
            letterPresent = true;
        }
    }

    // method to check if password contains at least one number
    public void oneNumber(String password){
        if(password.matches(".*[0-9]+.*")){
            numberPresent = true;
        }
    }

    // method to check if password contains any special characters
    public void specChar(String password){
        Pattern p = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(password);
        specChar = m.find();
    }


    public int passwordValidator(String password) {
        int level;
        // calling the passNumber function to check if only numbers
        passNumber(password);
        // calling the passLetter function to check if only letters
        passLetter(password);
        // calling the letters function to check if letters are contained in the password
        letters(password);
        // calling the oneNumber function to check if at least one number is contained in the password
        oneNumber(password);
        // calling the specChar function to check if password contains special characters
        specChar(password);

        if (password.length() < 8 && resultNum) {
            level = 1;
        }
        else if (password.length() < 8 && resultLet){
            level = 2;
        }
        else if (password.length() > 7 && letterPresent && numberPresent && !specChar){
            level = 3;
        }
        else if (password.length() > 7 && letterPresent && numberPresent && specChar){
            level = 4;
        }
        else {
            level = 5;
        }

        return level;
    }
}
class App {
    public static void main(String[] args){
        System.out.println("Enter your password:");
        Scanner input = new Scanner(System.in);
        String pass = input.nextLine();
        String passwordLevel = "no";

        passVal p = new passVal();
        int level = p.passwordValidator(pass);

        if (level == 1) {
            passwordLevel = "very weak";
        }
       else if (level == 2) {
            passwordLevel = "weak";
        }
       else if (level == 3) {
            passwordLevel = "strong";
        }
       else if (level == 4){
            passwordLevel = "very strong";
        }
        else if (level == 5){
            passwordLevel = "neither a weak nor strong";
        }
        System.out.println("The password '" + pass + "' is a " + passwordLevel + " password.");
    }
}