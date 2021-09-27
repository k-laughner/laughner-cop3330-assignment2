/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex35;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class AppTest {
    pickWinner p;

    @BeforeEach
    void setUp() {
        p = new pickWinner();
    }

    @RepeatedTest(1000)
    @DisplayName("Checking that random number returns within specified range")
    void getRandomNumTest(){
        int count = 10;
        assertTrue(p.getRandomNum(count)>=0 && p.getRandomNum(count)<=count);
    }
}
