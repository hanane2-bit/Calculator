package test.cour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifierTest {
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

}
