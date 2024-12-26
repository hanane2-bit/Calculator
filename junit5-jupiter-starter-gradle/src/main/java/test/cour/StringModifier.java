package test.cour;

public class StringModifier {
    public String inverse(String str) {
        int length =str.length();
        String racine=str.substring(0,length-2);
        char avantDernierCaracter=str.charAt(length-2);
        char dernierCaracter=str.charAt(length-1);

        return (racine+dernierCaracter+avantDernierCaracter);
    }
}
