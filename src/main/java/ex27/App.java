/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex27;
import java.util.Scanner;
import java.lang.String;

class validatingInput {
    public boolean fName(String firstName) {
        if (firstName.length() >= 2){
            return true;
        }
        else {
            if(firstName.isEmpty()) {
                System.out.println("The first name must be filled in.");
            }
            System.out.println("The first name must be at least 2 characters long.");
            return false;
        }
    }
    public boolean lName(String lastName){
        if (lastName.length() >= 2){
            return true;
        }
        else {
            if(lastName.isEmpty()) {
                System.out.println("The last name must be filled in.");
            }
            System.out.println("The last name must be at least 2 characters long");
            return false;
        }
    }
    public boolean zip(String zipCode){
        boolean zipValid = false;
        for (int i = 0; i < zipCode.length(); i++) {
            if (Character.isDigit(zipCode.charAt(i)) && zipCode.length() == 5){
                zipValid = true;
            }
            else {
                zipValid = false;
                System.out.println("The zipcode must be a 5 digit number.");
                break;
            }
        }
        return zipValid;
    }
    public boolean empID(String employeeId){
        char hyphen = '-';
        String output = "The employee ID must be in the format of AA-1234.";
        if(Character.isLetter(employeeId.charAt(0)) && Character.isLetter(employeeId.charAt(1)) && employeeId.charAt(2)== hyphen &&
                Character.isDigit(employeeId.charAt(3)) && Character.isDigit(employeeId.charAt(4)) && Character.isDigit(employeeId.charAt(5)) &&
                Character.isDigit(employeeId.charAt(6)) && employeeId.length() == 7) {
            return true;
        }
        else {
            System.out.println(output);
            return false;
        }
    }
    public boolean validateInput(String firstName, String lastName, String zipCode, String employeeId){
        boolean f = fName(firstName);
        boolean l = lName(lastName);
        boolean z = zip(zipCode);
        boolean e = empID(employeeId);
        if (f && l && z && e){
            return true;
        }
        else {
            return false;
        }
    }
}
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Enter the first name: " );
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();

        System.out.println("Enter the last name:");
        Scanner input2 = new Scanner(System.in);
        String lastName = input2.nextLine();

        System.out.println("Enter the zip code:");
        Scanner input3 = new Scanner(System.in);
        String zip = input3.nextLine();

        System.out.println("Enter the employee ID:");
        Scanner input4 = new Scanner(System.in);
        String empID = input4.nextLine();

        validatingInput v = new validatingInput();
        boolean valid = v.validateInput(firstName, lastName, zip, empID);
        if (valid) {
            System.out.println("There were no errors.");
        }
    }
}
