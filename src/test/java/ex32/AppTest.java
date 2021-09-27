/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex32;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {
    GuessingGame g;

    @BeforeEach
    void setUp() {
        g = new GuessingGame();
    }

    @RepeatedTest(1000)
    @DisplayName("Checking that random number returned is within range 1-10")
    void testRandomForDif1() {
        assertTrue(1<=g.getRandom(10,1) && g.getRandom(10,1) <=1000);

    }

    @RepeatedTest(1000)
    @DisplayName("Checking that random number returned is within range 1-100")
    void testRandomForDif2() {
        assertTrue(1<=g.getRandom(100,1) && g.getRandom(100,1) <=1000);

    }

    @RepeatedTest(1000)
    @DisplayName("Checking that random number returned is within range of 1-1000")
    void testRandomForDif3() {
        assertTrue(1<=g.getRandom(1000,1) && g.getRandom(1000,1) <=1000);
    }
}
