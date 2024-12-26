package com.calculatorString.tdd;

public class AddString {

    public static int evaluate(String input) {
/*
        if (chaine == null || chaine.isEmpty()) {
            return 0;
        }
        if(!chaine.equals(",")){ return Float.valueOf(chaine);}
        else {

            String[] numbers = chaine.split(",");
            for (String number : numbers) {
                if (!number.trim().isEmpty()) {
                float sum = 0;
                sum += Float.parseFloat(number.trim());
                return sum;
            }
        }



            }




   return 0;


*/
        if (input == null || input.isEmpty()) {
            return 0;
        }

        // Règle 5 : Remplacer les sauts de ligne par des virgules
        input = input.replace("\n", ",");

        // Séparer les nombres
        String[] numbers = input.split(",");

        // Calculer la somme

        int sum = 0;
        for (String number : numbers) {
            if (!number.trim().isEmpty()) {
                sum += Integer.parseInt(number.trim());
            }
        }

        return sum;
    }
}






