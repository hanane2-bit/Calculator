package com.calcutorString.tdd;
import static org.junit.jupiter.api.Assertions.*;
import com.calculatorString.tdd.AddString;
import org.junit.jupiter.api.Test;

public class AddStringTest {

    @Test
    public void calculStingTest1() {

        String chaine= "";

        int Somme= AddString.evaluate(chaine);

        assertEquals(0,Somme  );

    }

   @Test
    public void calculStringTest2(){

       String chaine = "20";

       // WHEN
       int result =  AddString.evaluate(chaine);

       // THEN
       assertEquals(20, result);
   }
@Test
    public void calculStringTest3(){
        String chaine="3,5";

       int  result=AddString.evaluate(chaine);

        assertEquals(8,result);
}






}
