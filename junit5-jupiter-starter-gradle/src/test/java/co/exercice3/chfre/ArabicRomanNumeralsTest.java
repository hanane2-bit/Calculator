package co.exercice3.chfre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class ArabicRomanNumeralsTest{
 @Test
 public void givenNumber1_whenConvert_thenReturnI() {
  // Given
  int number = 1;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("I", result);
 }
 @Test
 public void givenNumber2_whenConvert_thenReturnII() {
  // Given
  int number = 2;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("II", result);
 }


 @Test
 public void givenNumber6_whenConvert_thenReturnVI() {
  // Given
  int number = 6;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("VI", result);
 }

 @Test
 public void givenNumber20_whenConvert_thenReturnXX() {
  // Given
  int number = 20;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("XX", result);
 }

 // Règle 2 : Soustraction des valeurs (L1 < L2)
 @Test
 public void givenNumber4_whenConvert_thenReturnIV() {
  // Given
  int number = 4;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("IV", result);
 }

 @Test
 public void givenNumber9_whenConvert_thenReturnIX() {
  // Given
  int number = 9;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("IX", result);
 }

 // Règle 3 : Maximum 3 répétitions
 @Test
 public void givenNumber3_whenConvert_thenReturnIII() {
  // Given
  int number = 3;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("III", result);
 }

 @Test
 public void givenNumber4_whenConvert_thenReturnNotIIII() {
  // Given
  int number = 4;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertNotEquals("IIII", result);
 }

 // Règle 4 : Combinaisons correctes
 @Test
 public void givenNumber40_whenConvert_thenReturnXL() {
  // Given
  int number = 40;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("XL", result);
 }

 @Test
 public void givenNumber50_whenConvert_thenReturnL() {
  // Given
  int number = 50;

  // When
  String result = ArabicRomanNumerals.convert(number);

  // Then
  assertEquals("L", result);
 }

 // Tests pour les cas invalides
 @Test
 public void givenNumber0_whenConvert_thenThrowException() {
  // Given
  int number = 0;

  // When & Then
  assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(number));
 }

 @Test
 public void givenNumber51_whenConvert_thenThrowException() {
  // Given
  int number = 51;

  // When & Then
  assertThrows(IllegalArgumentException.class, () -> ArabicRomanNumerals.convert(number));
 }

 }


