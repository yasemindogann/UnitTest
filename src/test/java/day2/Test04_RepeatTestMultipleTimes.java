package day2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test04_RepeatTestMultipleTimes {

    //Testi tekrarlatmak istersem
    //@Test
    @RepeatedTest(5)    //5 defa çalışacak
    void testSubstring(){

        assertEquals("Java","Java is an OOP language".substring(0,4));
        System.out.println("test çalıştı");

    }

    //
    @RepeatedTest(3)
    @Disabled   //methodu yorum satırına almış gibi çalıştırmaz.Method pasif hale geldi
    void testRepeated(){

        assertEquals(2, Math.addExact(1,1));
        System.out.println("test2 çalıştı");

    }

    //3.Örnek
    Random rm = new Random();
    @RepeatedTest(3)
    void testMathExacly(){

        int sayi1 = rm.nextInt(10);
        int sayi2 = rm.nextInt(10);

        assertEquals(sayi1+sayi2, Math.addExact(sayi1,sayi2));
        System.out.println("sayi1: " + sayi1 + " sayi2: " + sayi2);

    }









}
