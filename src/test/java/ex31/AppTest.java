/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex31;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {
    heartRate h;

    @BeforeEach
    void setUp() {
        h = new heartRate();
    }

    @Test
    void testCalculate() {
        double[] expectedArr = {138, 145, 151, 158, 165, 171, 178, 185, 191};
        double[] actualArr = h.calculate(22, 65);
        assertArrayEquals(expectedArr, actualArr);
    }
}
