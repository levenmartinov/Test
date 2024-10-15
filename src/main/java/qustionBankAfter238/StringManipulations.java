package qustionBankAfter238;

public class StringManipulations {
    public static void main(String[] args) {

  /*      //1) Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
        //!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
        //yazdırınız.

        String sehirIsim = "bUrSA";
        String sehirIsim1 = "IzMIR";

        String konsolSehirIsim = sehirIsim.trim().toLowerCase();
        String konsolSehirIsim1 = sehirIsim1.trim().toLowerCase();
        konsolSehirIsim = konsolSehirIsim.substring(0, 1).toUpperCase() + konsolSehirIsim.substring(1);
        konsolSehirIsim1 = konsolSehirIsim1.substring(0, 1).toUpperCase() + konsolSehirIsim1.substring(1);
        System.out.println(konsolSehirIsim); Bursa
        System.out.println(konsolSehirIsim1); Izmir*/

  /*      //2) K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
        //karakter sayısının toplamını yazdırınız.
        //Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.

        String isim1 = "Ali Can";
        String isim2 = "Aliye Canan";
        String isim3 = "Aliyev Can Cananov";

        Integer c1 = isim1.replaceAll("\\s", "").length();
        Integer c2 = isim2.replaceAll("\\s", "").length();
        Integer c3 = isim3.replaceAll("\\s", "").length();
        System.out.println("Bosluk karekteri olamdan 3 ismin toplam karakter sayisi: " + (c1 + c2 + c3));  //32*/

/*        //3) B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını
        //konsolda yazdırınız.
        //Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String s = "Miami 33018!!!";
        Integer karakterSayisi = s.replaceAll("\\s", "").
                replaceAll("[^A-Za-z0-9]", "").length();
        System.out.println("Toplam alfabetik ve sayilsal karekter sayisi: " + karakterSayisi); //10*/

/*        //4) B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
        //konsolda yazdırınız.
        //Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         String s = "1a3Bcf4!...";
         Integer karakterSayisi = s.replaceAll("[0-9]", "").length();
        System.out.println("Karekter sayisi:" + karakterSayisi); //8*/

/*        //5) B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
        //karakter! yazdırınız.
        //Örnek: 'Ali Can' için n yazdırmalısınız.
        //‘Miami’ için i yazdırmalısınız.

        String s = "Ali Can   ";
        int boslukOlmayanSonKarakIndex = s.trim().length() - 1;
        String boslukOlmayanSonKarak = s.substring(boslukOlmayanSonKarakIndex, boslukOlmayanSonKarakIndex + 1);
        System.out.println("Bosluk yok: " + boslukOlmayanSonKarak); */

/*        //6) B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
        //toplamını bulunuz.
        String s = "Miami";
        int sonKrkIndex = s.length() - 1;
        int ilkKrkAscii = s.charAt(0);
        int sonKrkAscii = s.charAt(sonKrkIndex);
        System.out.println("Ilk ve Son index Ascii toplam: " + (ilkKrkAscii + sonKrkAscii)); //182*/

/*        //7) B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
        //yazdırınız.
        //Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.

        String s = "nNigar";
        String ilkKrkDisinda = s.substring(1);
        System.out.println("Askim => " + ilkKrkDisinda); //Askim => Nigar*/














    }
}
