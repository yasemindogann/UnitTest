package day1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test03_BeforeEach_AfterEach {

    //Yazdığım methodlar sırayla çalışmaz karışık çalışır.
    //Bunun nedeni bütün metodların birbirinden bağımsız olması
    //Bağımlı testlerde bu methodlar birbirine bağımlı diye belirticez.
    // test methodlarinin calisma sirasini kendimiz belirlemek istiyorsak JUnit4 --> @FixMethodOrder
    //JUnit5 -->@TestMethodOrder

    String str;

    //Her metoddan önce çalıştığı için 10 tane metod olsa 10 defa çalışacak
    //Bu bir sorun
    //Bunun yerine before diye bir method oluşturalım en başta o çalışsın
    //sonra methodlar tek tek hepsi çalışsın
    @BeforeEach  //Her teste girmeden önce bu kısım çalışacak
    void beforeEach(){

        str = "JUnit5 is better than JUnit4";
        System.out.println("***** BeforeEach() çalıştı *****");

    }

    //Her metoddan sonra çalıştığı için 10 tane metod olsa 10 defa çalışacak
    //Bu bir sorun
    //Bunun yerine after diye bir method oluşturalım bütün methodlar tek tek çalışsın en son bu method çalışsın
    @AfterEach  //Her testten çıktıktan sonra bu kısım çalışacak
    void afterEach(){

        str = null;
        System.out.println("***** AfterEach() çalıştı *****");

    }

    @Test
    void testSplit(TestInfo info){

        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"JUnit5", "is", "better", "than", "JUnit4"};

        //Hangi test methodu çalıştı onu gösterecek
        System.out.println(info.getDisplayName() + " çalıştı");

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));

    }


    @Test
    void testStringLength(TestInfo info){

        int anlikDeger = str.length();
        int beklenenDeger = 28;

        assertEquals(beklenenDeger,anlikDeger);

        //Hangi test methodu çalıştı onu gösterecek
        System.out.println(info.getDisplayName() + " çalıştı");

    }





}
