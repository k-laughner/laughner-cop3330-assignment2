/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex33;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    magic8 m;

    @BeforeEach
    void setUp() {
        m = new magic8();
    }

    @RepeatedTest(1000)
    @DisplayName("Checking that random number function always return a value in range")
    void getRandomNumTest() {
        assertTrue(m.getRandomNum() >= 0 && m.getRandomNum() <= 3);
    }
}
