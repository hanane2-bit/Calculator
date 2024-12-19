package com.controle.tdd;

import static com.controle.tdd.FizzBuzz.FizzBuzz_de;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class FizzBuzzTest {
 @Test
 void testFizzBuzz1() {
     // Given
     int input = 1;

     // When
     String result = FizzBuzz_de(input);

     // Then
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

 }





