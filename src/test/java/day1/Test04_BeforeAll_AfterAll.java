package day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {

    //defaultta test methodları sondan başlayarak çalışır.

    //Bütün testler başlamadan önce çalıssın
    @BeforeAll
    static void beforeAll(){

        //Mesela serverdaki bir file açılacak
        System.out.println("Open a file");

    }

    //Bütün testler bittikten sonra çalışsın
    @AfterAll
    static void afterAll(){
        System.out.println("Close a file");

    }

    //
    @Test
    void testWithArrays(){

        String str = "Unit test with JUnit5";
        String[] anlikDeger = str.split(" ");
        String[] beklenenDizi = {"Unit", "test", "with", "JUnit5"};

        System.out.println("testWithArrays() calisti");

        //Arrayler eşit mi bakıyor
        assertArrayEquals(anlikDeger, beklenenDizi, "Diziler eşit değil!");

    }

    @Test
    void testWithArrays2(){

        String str = "Unit test with JUnit5";
        String[] anlikDeger = str.split(" ");
        String[] beklenenDizi = {"Unit", "test", "with", "JUnit5"};

        System.out.println("testWithArrays2() calisti");

        //Arrayler eşit mi bakıyor
        assertArrayEquals(anlikDeger, beklenenDizi, "Diziler eşit değil!");

    }

}
