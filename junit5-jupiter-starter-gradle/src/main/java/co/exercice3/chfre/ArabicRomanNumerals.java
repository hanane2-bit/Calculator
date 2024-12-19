package co.exercice3.chfre;
public class ArabicRomanNumerals {
    public static String convert(int nbr) {

        if (nbr <= 0 || nbr > 50) {
            throw new IllegalArgumentException("Le nombre doit être entre 1 et 50");
        }

        // Table des correspondances
        String[] romanNumerals = {"L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabicNumbers = {50, 40, 10, 9, 5, 4, 1};

        StringBuilder resultat = new StringBuilder();

        for (int i = 0; i < arabicNumbers.length; i++) {
            while (nbr >= arabicNumbers[i]) {
                resultat.append(romanNumerals[i]);
                nbr -= arabicNumbers[i];
            }
        }

        return resultat.toString();
    }
}







