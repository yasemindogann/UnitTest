package day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifyTest {

    StringModify obj1;

    @BeforeEach
    void setUp(){

        obj1 = new StringModify();
        System.out.println(" BeforeEach çalıştı.");

    }

    @AfterEach
    void tearDown(){

        obj1 = null;
        System.out.println("AfterEach çalıştı.");

    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC", "BC, ABC"})
    void deleteIfItIsInFirstTwoPosition(String expected, String actual){

        assertEquals(expected,obj1.deleteIfItIsInFirstTwoPosition(actual));

    }



}
