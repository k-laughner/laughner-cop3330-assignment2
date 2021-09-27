/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Kaylee Laughner
 */
package ex25;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class passValTest {

    passVal p;

    @BeforeEach
    void setUp() {
        p = new passVal();
    }

    @Test
    @DisplayName("Very Weak Password Testing")
    void testPasswordValidatorWithVeryWeakPassword() {
        assertEquals(1, p.passwordValidator("12345"));
    }

    @Test
    @DisplayName("Weak Password Testing")
    void testPasswordValidatorwithWeakPassword() {
        assertEquals(2, p.passwordValidator("abcdef"));
    }

    @Test
    @DisplayName("Strong Password Testing")
    void testPasswordValidatorWithStrongPassword() {
        assertEquals(3, p.passwordValidator("abc123xyz"));
    }

    @Test
    @DisplayName("Very Strong Password Testing")
    void testPasswordValidatorWithVeryStrongPassword() {
        assertEquals(4, p.passwordValidator("1337h@xor!"));
    }

    @Test
    @DisplayName("Neither weak nor strong Testing")
    void testPasswordValidatorWithNeither() {
        assertEquals(5, p.passwordValidator("abce12"));
    }
}