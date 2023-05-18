package day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_Assertions2 {

    //Bazen yapacağım testlerde "Bu doğru değil mi?" şeklinde kontroller yapmam gerekirse;

    @Test
    public void testToFindMin(){

        //Dönen değer 4 olacak değil mi diyor
        //Beklenti = True     Sonuc = True    Geçer
          assertTrue(Math.min(4,10) == 4);

        //Dönen değerin 10 olması yanlış de mi diyor
        //Beklenti = False    Sonuc = False    Geçer
          assertFalse(Math.min(4,10) == 10);

    }

    //
    @Test
    public void testSplit(){

        String str = "Test islemi cok kolay";
        String[] anlikDizi = str.split(" ");    //{"Test" "islemi" "cok" "kolay"}
        String[] beklenenDizi = {"Test", "islemi", "cok", "kolay"};

        assertTrue(Arrays.equals(anlikDizi,beklenenDizi));

    }

}
