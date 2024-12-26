package test.cour;

public class StringModifier {
    public String inverse(String str) {
        String chaineARetourner =str;
        int length =str.length();
        if (length>=2){
        String racine=str.substring(0,length-2);
        char avantDernierCaracter=str.charAt(length-2);
        char dernierCaracter=str.charAt(length-1);
            chaineARetourner=racine+dernierCaracter+avantDernierCaracter;

    }
        return chaineARetourner;
    }
}
