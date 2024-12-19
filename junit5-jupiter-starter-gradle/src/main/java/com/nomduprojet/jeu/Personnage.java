package com.nomduprojet.jeu;

import java.util.Arrays;

public class Personnage {
    private String orientation;
    private static final String[] ORIENTATIONS = {"NORD", "EST", "SUD", "OUEST"};

    public Personnage() {
        this.orientation = ORIENTATIONS[0]; // Orientation initiale : NORD
    } //consturcteur
    public String tourner(int fois) {
        String[] orientations = {"NORD", "EST", "SUD", "OUEST"};
        int indexActuel = Arrays.asList(orientations).indexOf(orientation);  // Trouver l'indice actuel

        int nouvelIndex = (indexActuel + fois) % 4;
        if (nouvelIndex < 0) {
            nouvelIndex += 4;
        }
        orientation = orientations[nouvelIndex];
        return orientation;
    }


    public String getOrientation() {
        return orientation;
    }
}
/*
3. Refactor por impliment la methode tourne
public String tourner(int fois) {
        // Calcul de la nouvelle orientation
        int indexCourant = 0;
        for (int i = 0; i < ORIENTATIONS.length; i++) {
            if (ORIENTATIONS[i].equals(orientation)) {
                indexCourant = i;
                break;
            }
        }
        int nouvelIndex = (indexCourant + fois) % ORIENTATIONS.length;
        if (nouvelIndex < 0) {
            nouvelIndex += ORIENTATIONS.length; // Gestion des valeurs négatives
        }
        orientation = ORIENTATIONS[nouvelIndex];
        return orientation;
    }
*/

