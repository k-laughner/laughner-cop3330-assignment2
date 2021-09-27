/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex30;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
    MultiplicationTable m;

    @BeforeEach
    void setUp() {
        m = new MultiplicationTable();
    }

    @Test
    void tableTest() {
        assertEquals("Ran successfully", m.table());
    }
}
