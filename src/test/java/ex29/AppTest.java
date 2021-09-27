/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex29;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    doublingInvestments d;

    @BeforeEach
    void setup() {
        d = new doublingInvestments();
    }

    @Test
    void calculateTest() {
        assertEquals(18, d.calculate(4));
    }

}
