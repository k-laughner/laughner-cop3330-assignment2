/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex26;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PaymentCalculatorTest {

    PaymentCalculator p;

    @BeforeEach
    void setUp() {
        p = new PaymentCalculator();
    }

    @Test
    @DisplayName("Payment Calculator Testing")
    void testPaymentCalculatorForMonths() {
        assertEquals(70, p.calculateMonthsUntilPaidOff(5000, 12, 100));
    }
}