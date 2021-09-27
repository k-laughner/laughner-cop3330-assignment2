/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex34;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class AppTest {
    employees e;

    @BeforeEach
    void setUp() {
        e = new employees();
    }

    @Test
    void removeTest() {
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("John Smith");
        expectedOutput.add("Jackie Jackson");
        expectedOutput.add("Amanda Cullen");
        expectedOutput.add("Jeremy Goodwin");
        List<String> emp = e.list();
        List<String> actualOutput = e.remove(emp, "Chris Jones");
        assertArrayEquals(expectedOutput.toArray(), actualOutput.toArray());
    }
}
