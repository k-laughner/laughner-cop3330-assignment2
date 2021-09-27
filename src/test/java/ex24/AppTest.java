/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex24;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;

class anagramCheckerTest {
    anagramChecker a;

    @BeforeEach
    void setup(){
        a = new anagramChecker();
    }

    @RepeatedTest(2)
    @DisplayName("Testing Anagram Function")
    void isAnagramTest() {
        assertEquals(true, a.isAnagram("done", "node"));
        assertEquals(false, a.isAnagram("done", "nope"));
    }
}