package com.controle.tdd;

import static com.controle.tdd.FizzBuzz.FizzBuzz_de;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class FizzBuzzTest {
 @Test
 void testFizzBuzz1() {

     int input = 1;


     String result = FizzBuzz_de(input);


     assertEquals("1", result);
 }
    @Test
    void testFizzBuzz3() {
        // Given
        int input = 3;

        // When
        String result = FizzBuzz_de(input);

        // Then
        assertEquals("Fizz", result);
    }

    @Test
    void testFizzBuzz5() {
        // Given
        int input = 5;

        // When
        String result = FizzBuzz_de(input);

        // Then
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzz15() {
        // Given
        int input = 15;

        // When
        String result = FizzBuzz_de(input);

        // Then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testFizzBuzz2() {
        // Given
        int input = 2;

        // When
        String result = FizzBuzz_de(input);

        // Then
        assertEquals("2", result);
    }

    // Test paramétré (1 à 20) avec "Given-When-Then"
    @Test
    void testFizzBuzzParametrized() {
        // Given
        String[] expectedResults = {
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"
        };

        // When & Then
        for (int i = 1; i <= 20; i++) {
            String result = FizzBuzz_de(i);
            // Then
            assertEquals(expectedResults[i - 1], result, "Error at i = " + i);
        }
    }



 }





