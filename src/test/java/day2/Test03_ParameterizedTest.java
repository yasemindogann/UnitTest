package day2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_ParameterizedTest {

    @Test
    void testLength(){

        assertTrue("Yasemin".length() > 0);
        assertTrue("Banu".length() > 0);
        assertTrue("Ebrar".length() > 0);
        assertTrue("Nisa".length() > 0);

    }

    //Yukardaki methodda 4 defa assertTrue yazdık.Ama bunu daha clean şekilde yapmak için:
    @ParameterizedTest
    @ValueSource(strings = {"Yasemin","Banu","Ebrar","Nisa"})
    void testLength2(String str){

        assertTrue(str.length() > 0);

    }

    //2.Örnek
    @Test
    void testUpperCase(){

        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";
        
        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());

    }

    //YUKARDAKİ ÖRNEK PARAMETRELİ OLARAK
    @ParameterizedTest
    @CsvSource( value = {
            "MERHABA, merhaba",
            "JAVA, java",
            "TEST, test"
    })
    void testUpperCase2(String str1, String  str2){

        assertEquals(str1, str2.toUpperCase());

    }


    //3.Örnek
    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "true,junit,u","false,hello,a"})
    void testContains(boolean b1, String str1, String str2){

        assertEquals(b1, str1.contains(str2));

    }
    
}
