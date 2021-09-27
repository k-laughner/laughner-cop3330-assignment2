/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex37;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    getRandomFromList g;
    String specChar;
    @BeforeEach
    void setUp() {
        g = new getRandomFromList();
        specChar = g.getRandomSpecialCharacter();
    }

    @RepeatedTest(1000)
    @DisplayName("Checks that random number is a value between 0-9")
    void getRandomNumberTest() {
        assertTrue(Integer.parseInt(g.getRandomNumber())>=0 && Integer.parseInt(g.getRandomNumber())<=9);
    }

    @RepeatedTest(1000)
    @DisplayName("Checks that random character is a letter from a-z")
    void getRandomCharTest() {
        assertTrue(g.getRandomChar().length() == 1 && g.getRandomChar().matches("[a-zA-Z]+"));
    }

    @RepeatedTest(1000)
    @DisplayName("Checks that special char is given from getRandomSpecialChar function")
    void getRandomSpecCharTest() {
        assertTrue(specChar.equals("!") ||
                specChar.equals("@") ||
                specChar.equals("#") ||
                specChar.equals(".") ||
                specChar.equals("$") ||
                specChar.equals("*") ||
                specChar.equals("-") ||
                specChar.equals("+"));
    }
}
