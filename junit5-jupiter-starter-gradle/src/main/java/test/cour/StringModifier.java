package test.cour;

public class StringModifier {
    public String inverse(String str) {
        char premierCaracter=str.charAt(0);
        char secondCaracter=str.charAt(1);

        return (""+secondCaracter+premierCaracter);
    }
}
