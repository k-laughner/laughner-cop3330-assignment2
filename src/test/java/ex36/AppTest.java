/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class AppTest {
    Stats s;
    ArrayList list() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(1000);
        return numbers;
    }

    @BeforeEach
    void setUp() {
        s = new Stats();
    }

    @Test
    void getCountTest() {
        ArrayList<Integer> numbers = list();
        int actualOutput = numbers.size();
        assertEquals(4, actualOutput);
    }

    @Test
    void average() {
        ArrayList<Integer> numbers = list();
        int count = numbers.size();
        assertEquals(400, s.average(numbers, count));
    }

    @Test()
    void max() {
        ArrayList<Integer> numbers = list();
        assertEquals(1000, s.max(numbers));
    }

    @Test()
    void min() {
        ArrayList<Integer> numbers = list();
        assertEquals(100, s.min(numbers));
    }

    @Test()
    void std() {
        ArrayList<Integer> numbers = list();
        int count = numbers.size();
        // expected must be rounded to 2 decimal places
        assertEquals(353.55, s.std(numbers, count));
    }
}
