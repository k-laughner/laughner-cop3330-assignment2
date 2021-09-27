/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex30;

class MultiplicationTable {
    public String table() {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%3d ", i*j);
            }
            // create rows
            System.out.println();
        }
        // return variable for JUnit5 testing
        String success = "Ran successfully";
        return success;
    }
}
public class App {
    public static void main( String[] args )
    {
        MultiplicationTable m = new MultiplicationTable();
        m.table();
    }
}