package study;

import java.util.Scanner;

public class Test_Study {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Kahve seçimi
        System.out.println("Hangi Kahveyi İstersiniz?");
        System.out.println("1. Türk kahvesi");
        System.out.println("2. Filtre Kahve");
        System.out.println("3. Espresso");

        String hangiKahve = sc.nextLine().trim().toLowerCase();
        String kahveMesaj = "";

        switch (hangiKahve) {
            case "turk kahvesi":
                kahveMesaj = "Türk kahvesi hazırlanıyor.";
                break;
            case "filtre kahve":
                kahveMesaj = "Filtre kahve hazırlanıyor.";
                break;
            case "espresso":
                kahveMesaj = "Espresso hazırlanıyor.";
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
                return;
        }
        System.out.println(kahveMesaj);

        // Süt ekleme
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız): ");
        String sut = sc.nextLine().trim().toLowerCase();

        if (sut.equals("evet")) {
            System.out.println("Süt ekleniyor...");
        } else if (sut.equals("hayır")) {
            System.out.println("Süt eklenmiyor");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.");
            return;
        }

        // Şeker ekleme
        System.out.println("Şeker ister misiniz? (Evet veya hayır cevabını veriniz): ");
        String seker = sc.nextLine().trim().toLowerCase();

        if (seker.equals("evet")) {
            System.out.println("Kaç şeker olsun?");
            int kacSeker = sc.nextInt();
            System.out.println(kacSeker + " şeker ekleniyor.");
            String bosKod = sc.nextLine(); // dummy kod
        } else if (seker.equals("hayır")) {
            System.out.println("Şeker eklenmiyor");
        } else {
            System.out.println("Hatalı tuşlama yaptınız.");
            return;
        }

        // Boyut seçimi
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz): ");
        String boyut = sc.nextLine().trim().toLowerCase();
        String boyutMesaj = "";

        switch (boyut) {
            case "büyük boy":
                boyutMesaj = "Kahveniz " + boyut + " hazırlanıyor.";
                break;
            case "orta boy":
                boyutMesaj = "Kahveniz " + boyut + " hazırlanıyor.";
                break;
            case "küçük boy":
                boyutMesaj = "Kahveniz " + boyut + " hazırlanıyor.";
                break;
            default:
                System.out.println("Hatalı tuşlama yaptınız.");
                return;
        }
        System.out.println(boyutMesaj);

        // Sipariş sonucu
        System.out.println(hangiKahve + " " + boyut + " hazırdır. Afiyet olsun!!!");

    }
}
