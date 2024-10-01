package study;


import java.util.Scanner;

public class KartIslemleri {
    public static void main(String[] args) {
        String kartNumarasi = "1234 5678 0000 0000";
        String sifre = "12Q";
        float bakiye = 120000F;

        boolean kartNoSifreKontrol;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Kart numaranızı giriniz: ");
            String kartNumarasiMus = input.nextLine();

            System.out.println("Şifrenizi Giriniz: ");
            String sifreMus = input.nextLine();

            // Kart numarasındaki boşlukları kaldırarak karşılaştır
            kartNoSifreKontrol = kartNumarasi.replaceAll("\\s", "").equals(kartNumarasiMus.replaceAll("\\s", ""))
                    && sifre.equals(sifreMus);

            if (kartNoSifreKontrol) {
                System.out.println("Giriş başarılı");
                String menu;
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz: \n 1-Bakiye Sorgulama \n 2-Para Yatırma " +
                            "\n 3-Para Çekme \n 4-Para Gönderme \n 5-Şifre Değiştirme \n 6-Çıkış ");
                    menu = input.next();


                    switch (menu) {
                        case "1":     // Bakiye sorgulama

                            System.out.println("Bakiyeniz : " + bakiye);
                            break;

                        case "2":     // Para yatırma

                            System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                            String yatirilan = input.next(); //yatırılan parayı kullanıcı hatalarını onlemek için string aldım.

                            if (yatirilan.replaceAll("[^0-9]", "").length() == yatirilan.length()) {
                                Integer yatirilan1 = Integer.valueOf(yatirilan);


                                if (yatirilan1 > 0) {
                                    bakiye += yatirilan1;
                                    System.out.println("Yeni bakiyeniz: " + bakiye);
                                } else {
                                    System.out.println("Geçersiz tutar.");
                                }
                            } else
                                System.out.println("Para yatırma işlemi için geçerli bir miktar giriniz.");
                            break;

                        case "3":     // Para çekme

                            System.out.println("Çekmek istediğiniz tutarı giriniz: ");
                            String cekilen = input.next();

                            if (cekilen.replaceAll("[^0-9]", "").length() == cekilen.length()) {
                                Integer cekilen1 = Integer.valueOf(cekilen);

                                if (cekilen1 > 0 && cekilen1 <= bakiye) {
                                    bakiye -= cekilen1;
                                    System.out.println("Yeni bakiyeniz: " + bakiye);
                                } else {
                                    System.out.println("Yetersiz bakiye veya geçersiz tutar.");
                                }

                            } else
                                System.out.println("Para çekme işlemi için geçerli bir miktar giriniz.");

                            break;

                        case "4":    // Para gönderme

                            System.out.println("Göndermek istediğiniz miktarı giriniz: ");
                            String gonderilen = input.next();
                            input.nextLine();  // Dummy nextLine()

                            if (gonderilen.replaceAll("[^0-9]", "").length() == gonderilen.length()) {
                                Integer gonderilen1 = Integer.valueOf(gonderilen);

                                if (gonderilen1 > 0 && gonderilen1 <= bakiye) {
                                    System.out.println("IBAN giriniz (TR ile başlamalı ve 26 karakter olmalı): ");
                                    String iban = input.nextLine();
                                    if (iban.startsWith("TR") && iban.length() == 26) {
                                        bakiye -= gonderilen1;
                                        System.out.println(gonderilen + " TL başarıyla gönderildi. Yeni bakiyeniz: " + bakiye);
                                    } else {
                                        System.out.println("Geçersiz IBAN.");
                                    }
                                } else {
                                    System.out.println("Yetersiz bakiye veya geçersiz tutar.");
                                }

                            } else System.out.println("Para gönderme işlemi için geçerli bir miktar giriniz.");

                            break;

                        case "5":    // Şifre değiştirme

                            input.nextLine();  // Dummy nextLine()
                            System.out.println("Mevcut Şifrenizi Giriniz: ");
                            String girilenSifre = input.nextLine();
                            if (girilenSifre.equals(sifre)) {
                                System.out.println("Yeni Şifrenizi Giriniz: ");
                                String yeniSifre = input.nextLine();
                                sifre = yeniSifre;
                                System.out.println("Şifreniz başarıyla değiştirildi.");
                            } else {
                                System.out.println("Mevcut şifre yanlış.");
                            }
                            break;

                        case "6":     // Çıkış işlemi
                            String cikisTeyit;
                            boolean gecerliCikisTeyit;

                            do {
                                cikisTeyit = input.nextLine();
                                gecerliCikisTeyit = cikisTeyit.equalsIgnoreCase("evet") || cikisTeyit.equalsIgnoreCase("hayır");

                                if (cikisTeyit.equalsIgnoreCase("evet")) {
                                    System.out.println("Çıkış yapılıyor...");
                                    menu = "6"; //
                                    break; // Switch-case'den çık
                                } else if (cikisTeyit.equalsIgnoreCase("hayır")) {
                                    System.out.println("Ana menüye yönlendiriliyorsunuz.");
                                    menu = "1";
                                } else {
                                    System.out.println("Çıkış yapmak istediğinizden emin misiniz? (Evet/Hayır");
                                }
                            }
                            while (!gecerliCikisTeyit);

                            break;
                        default:
                            System.out.println("Geçersiz işlem. Menüden 1 ile 6 arasında seçim yapınız.");
                    }

                } while (!menu.equals("6"));  // Menü döngüsü

            } else {
                System.out.println("Giriş başarısız. Tekrar deneyiniz.");
            }
        } while (!kartNoSifreKontrol);  // Kart doğrulama döngüsü
    }
}