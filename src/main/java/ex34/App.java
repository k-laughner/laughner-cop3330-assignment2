/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex34;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class employees {
    // method that returns a list of employees
    public List list() {
        List<String> emp = new ArrayList<>();
        emp.add("John Smith");
        emp.add("Jackie Jackson");
        emp.add("Chris Jones");
        emp.add("Amanda Cullen");
        emp.add("Jeremy Goodwin");
        return emp;
    }
    // method that prints list of employees
    public void printStatement(List<String> emp){
        System.out.println("There are " + emp.size() + " employees:");
        for (int i=0; i < emp.size(); i++){
            System.out.println(emp.get(i) + " ");
        }
    }
    // method that gets String input and returns it
    public String getInput(){
        System.out.println("\nEnter an employee name to remove:");
        Scanner input = new Scanner(System.in);
        String toBeRemoved = input.nextLine();
        return toBeRemoved;
    }
    // method that removes a String from a list
    public List remove(List<String> emp, String toBeRemoved) {
        emp.remove(toBeRemoved);
        return emp;
    }
}
public class App {
    public static void main( String[] args ) {
        employees e = new employees();
        List<String> emp = e.list();
        e.printStatement(emp);
        String toBeRemoved = e.getInput();
        List<String> emp2 = e.remove(emp, toBeRemoved);
        e.printStatement(emp2);
    }
}