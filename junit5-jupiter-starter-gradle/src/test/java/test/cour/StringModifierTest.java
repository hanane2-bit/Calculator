package test.cour;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifierTest {
    //private StringModifier modifier;

    @Test
    public void convertir(){
        //given
        StringModifier modifier =new StringModifier();
        String str="AB";
        //when
        String resultat =modifier.inverse(str);
        //then
        assertEquals("BA",resultat);

    }
   @Test
    public void convertir2(){
        //given
       StringModifier modifier=new StringModifier();
       String str="RIEN";
       //when
       String resultat=modifier.inverse(str);
       //than
       assertEquals("RINE",resultat);

   }
}
