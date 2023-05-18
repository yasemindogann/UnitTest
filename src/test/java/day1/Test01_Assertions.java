package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    //Classın testmesi için içindeki bütün methodların testten geçmesi lazım.
    //Eğer 1 method bile testten kalırsa class ta kalır.
    //Method method değil de class seviyesinde çalıştırmak istersek class adının yanındaki run tuşundan veya
    //sağ tık yaparak class seviyede çalıştırabiliriz.
    //Class içindeki bütün methodları kontrol eder.
    //Aksi halde method method kontrol yapar.

    @Test   //run işlemi bu annotation ile geliyor.Kaldırırsam run gidiyor.
    public void test(){
        //main methodu yokken nasıl çalıştırıyorum?
        //JUnit içinde gömülü olarak gelen main methodu çağırılıyor.
        //JUnit5(Jupiter) ile braber artık methodların erişim belirleyicisini artık public yapmak zorunda değiliz.
        //artık protected, default, private verebiliriz.
    }

    //Bir method test etmem lazım.Core Java'dan gelen gömülü library içindeki methodları test edelim.
    //Girdi belli çıktı belli olmalı.
    @Test
    public void testLength(){

        String cumle = "Merhaba Test";  //12 karakter
        int anlikDeger = cumle.length();
        int beklenenDeger = 12;

        assertEquals(beklenenDeger, anlikDeger);
        //assertEquals: Aldığı parametrelerin değerlerini karşılaştırır.Eğer değerler eşit ise test geçer değilse test kalır.

    }

    //farklı bir örnek ( toUpperCase() )
    @Test
    public void testUpperCase(){

        String anlikDeger = "Merhaba".toUpperCase(); //MERHABA
        String beklenenDeger = "MERHABA";

        assertEquals(beklenenDeger, anlikDeger,"Uppercase metodu düzgün çalışmadı!");
        //3.parametre eğer test başarısız olursa diye developera mesaj vermek için yazıldı..

    }

    @Test
    public void testToplama(){

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1,sayi2);    //15
        int beklenenDeger = 15;

        assertEquals(beklenenDeger,anlikDeger);

        //addExact: 2 değeri toplar.

    }

    //
    @Test
    public void testContains(){

        assertEquals(false, "Yasemin".contains("z"));
        //geçer çünkü false - false olacak sonuç
        //eğer expected değerine true verseydim contains sonucu false çıkacaktı
        //true - false eşleşmediği için kalacaktı.

    }

}
