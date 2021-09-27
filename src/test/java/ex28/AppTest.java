/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex28;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    Add5Numbers a;

    @BeforeEach
    void setup(){
        a = new Add5Numbers();
    }

    @Test
    void validateInputTest() {
        int[] numbers = {1, 2, 3, 4, 5};
        assertEquals(15, a.add(numbers));
    }
}