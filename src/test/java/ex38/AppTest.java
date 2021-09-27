/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex38;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;


class AppTest {
    classifyingNums c;

    @BeforeEach
    void setUp() {
        c = new classifyingNums();
    }

    @Test
    void filteringEvenNumbersTest() {
        int[] expectedOutput = {2, 4, 6, 8};
        int[] input = {1,2,3,4,5,6,7,8};
        int[] methodOutput = c.filterEvenNumbers(input);
        assertArrayEquals(expectedOutput, methodOutput);
    }
}
