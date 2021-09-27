/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex27;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;

class AppTest {
    validatingInput v;

    @BeforeEach
    void setup(){
        v = new validatingInput();
    }

    @RepeatedTest(2)
    @DisplayName("Testing Validate Input Function")
    void validateInputTest() {
        assertEquals(true, v.validateInput("John", "Johnson", "55555", "TK-4321"));
        assertEquals(false, v.validateInput("J", "", "ABCDE", "A12-1234"));
    }
    @RepeatedTest(3)
    @DisplayName("Testing First Name Function")
    void fNameTest() {
        assertEquals(true, v.fName("John"));
        assertEquals(false, v.fName("J"));
        assertEquals(false, v.fName(""));
    }

    @RepeatedTest(3)
    @DisplayName("Testing Last Name Function")
    void lNameTest() {
        assertEquals(true, v.lName("Silver"));
        assertEquals(false, v.lName(""));
        assertEquals(false, v.lName("L"));
    }

    @RepeatedTest(3)
    @DisplayName("Testing zip code Function")
    void zipTest() {
        assertEquals(true, v.zip("89932"));
        assertEquals(false, v.zip("892391"));
        assertEquals(false, v.zip(""));
    }

    @RepeatedTest(3)
    @DisplayName("Testing employee ID function")
    void empID() {
        assertEquals(true, v.empID("ID-1234"));
        assertEquals(false, v.empID("IDJ-82147"));
        assertEquals(false, v.empID("1221"));
    }
}