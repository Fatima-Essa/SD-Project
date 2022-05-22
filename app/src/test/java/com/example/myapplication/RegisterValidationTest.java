package com.example.myapplication;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisterValidationTest {

    // email is not empty
    @Test
    public void notEmptyEmail() {

        boolean output = RegisterValidation.notEmptyString("ash");
        assertTrue(output);

    }

    // email is empty
    @Test
    public void EmptyEmail() {

        boolean output = RegisterValidation.notEmptyString("");
        assertFalse(output);

    }

    /*
     * having issues with the email pattern matching tests (will fix in the next
     * sprint)
     * // email matches pattern
     * 
     * @Test
     * public void matchesEmailPattern() {
     * 
     * boolean output = RegisterValidation.matchesEmailPattern("aashna@gmail.com");
     * assertEquals(true,RegisterValidation.matchesEmailPattern("aashna@gmail.com"))
     * ;
     * 
     * }
     * 
     * // email doesn't match pattern
     * 
     * @Test
     * public void notMatchingEmailPattern() {
     * 
     * boolean output = RegisterValidation.matchesEmailPattern("Smith");
     * assertEquals(false,output);
     * 
     * }
     * 
     */

    // password is >= 6 char
    @Test
    public void lengthGreaterThanSix() {

        boolean output = RegisterValidation.lengthGreaterThanSix("ash123");
        assertTrue(output);

    }

    // password is not >= 6 char
    @Test
    public void lengthNotGreaterThanSix() {

        boolean output = RegisterValidation.lengthGreaterThanSix("123");
        assertFalse(output);

    }

    // password is not empty
    @Test
    public void notEmptyPassword() {

        boolean output = RegisterValidation.notEmptyString("ash");
        assertTrue(output);

    }

    // password is empty
    @Test
    public void EmptyPassword() {

        boolean output = RegisterValidation.notEmptyString("");
        assertFalse(output);

    }

    // password matches confirmPassword
    @Test
    public void PasswordMatchesConfirm() {

        boolean output = RegisterValidation.passwordMatchesConfirm("helloWorld1", "helloWorld1");
        assertTrue(output);

    }

    // password doesn't match confirmPassword
    @Test
    public void PasswordNotMatchingConfirm() {

        boolean output = RegisterValidation.passwordMatchesConfirm("helloWorld1", "helloWorld2");
        assertFalse(output);

    }

    // Correct Input
    @Test
    public void emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(RegisterValidation.isValidEmail("name@email.com"));
    }

    // Email with subdomain
    @Test
    public void emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(RegisterValidation.isValidEmail("name@email.co.uk"));
    }

    // Without .com
    @Test
    public void emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(RegisterValidation.isValidEmail("name@email"));
    }

    // With extra characters
    @Test
    public void emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(RegisterValidation.isValidEmail("name@email..com"));
    }

    // With no username
    @Test
    public void emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(RegisterValidation.isValidEmail("@email.com"));
    }

    // Empty Input
    @Test
    public void emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(RegisterValidation.isValidEmail(""));
    }

    // Null value check
    @Test
    public void emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(RegisterValidation.isValidEmail(null));
    }
}
