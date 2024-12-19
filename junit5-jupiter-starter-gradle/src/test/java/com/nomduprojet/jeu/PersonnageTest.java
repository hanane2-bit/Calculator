package com.nomduprojet.jeu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonnageTest {

       /* @Test
        void testTourner1() {
            Personnage personnage = new Personnage();

            assertEquals("EST", personnage.tourner(1));
        }*/
       @Test
       void testTourner1() {
           // Given
           Personnage personnage = new Personnage();

           // When
           String result = personnage.tourner(1);

           // Then
           assertEquals("EST", result);
       }


    @Test
        void testTourner2() {
            Personnage personnage = new Personnage();
            assertEquals("SUD", personnage.tourner(2));
        }

        @Test
        void testTourner3() {
            Personnage personnage = new Personnage();
            assertEquals("OUEST", personnage.tourner(3));
        }

        @Test
        void testTourner4() {
            Personnage personnage = new Personnage();
            assertEquals("NORD", personnage.tourner(4));
        }

        /*@Test
        void testTournerPlusDe4() {
            Personnage personnage = new Personnage();
            assertEquals("EST", personnage.tourner(5)); // 5 % 4 == 1
        }*/
/*
        @Test
        void testTournerValeurNegative() {
            Personnage personnage = new Personnage();
            assertEquals("OUEST", personnage.tourner(-1));
        }*/
    }


