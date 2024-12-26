package test.cour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifierTest {
    private StringModifier modifier;
    @BeforeEach
    void setUp(){ modifier=new StringModifier();}
    @AfterEach
    void tearDown(){modifier=null;}
    @Test
    public void convertir(){
        //given

        String str="AB";
        //when
        String resultat =modifier.inverse(str);
        //then
        assertEquals("BA",resultat);

    }
   @Test
    public void convertir2(){
        //given

       String str="RIEN";
       //when
       String resultat=modifier.inverse(str);
       //than
       assertEquals("RINE",resultat);

   }
   @Test
    public void convertir3(){
        //given

       String str ="abcdefghij";
       //when
       String resultat=modifier.inverse(str);
       //than
       assertEquals("abcdefghji",resultat);

   }
}
