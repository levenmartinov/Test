package study;

import java.util.Scanner;

public class BankaSistemiBasit {
    // Örnek kullanıcı verileri
    private static String kullaniciKartNumarasi = "1234567890123456";
    private static String kullaniciSifre = "1234";
    private static double bakiye = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kartNumarasi, sifre;

        // Kullanıcı girişi
        while (true) {
            System.out.print("Kart numaranızı giriniz: ");
            kartNumarasi = scanner.nextLine().replace(" ", "");  // Boşlukları kaldır

            System.out.print("Şifrenizi giriniz: ");
            sifre = scanner.nextLine();

            if (kartNumarasi.equals(kullaniciKartNumarasi) && sifre.equals(kullaniciSifre)) {
                System.out.println("Giriş başarılı!");
                break;
            } else {
                System.out.println("Kart numarası veya şifre hatalı. Tekrar deneyiniz.");
            }
        }

        // Ana menü döngüsü
        while (true) {
            System.out.println("\n--- Ana Menü ---");
            System.out.println("1. Bakiye Sorgulama");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Çekme");
            System.out.println("4. Para Gönderme");
            System.out.println("5. Şifre Değiştirme");
            System.out.println("6. Çıkış");
            System.out.print("Bir seçenek seçiniz: ");
            int secim = scanner.nextInt();

            if (secim == 1) {
                // Bakiye Sorgulama
                System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
            } else if (secim == 2) {
                // Para Yatırma
                System.out.print("Yatırmak istediğiniz tutar: ");
                double miktar = scanner.nextDouble();
                if (miktar > 0) {
                    bakiye += miktar;
                    System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                } else {
                    System.out.println("Geçersiz tutar.");
                }
            } else if (secim == 3) {
                // Para Çekme
                System.out.print("Çekmek istediğiniz tutar: ");
                double miktar = scanner.nextDouble();
                if (miktar > 0 && miktar <= bakiye) {
                    bakiye -= miktar;
                    System.out.println("Yeni bakiyeniz: " + bakiye + " TL");
                } else {
                    System.out.println("Yetersiz bakiye veya geçersiz tutar.");
                }
            } else if (secim == 4) {
                // Para Gönderme
                scanner.nextLine();  // Yeni satırı temizle
                System.out.print("IBAN giriniz (TR ile başlamalı ve 26 karakter olmalı): ");
                String iban = scanner.nextLine();
                if (iban.startsWith("TR") && iban.length() == 26) {
                    System.out.print("Göndermek istediğiniz tutar: ");
                    double miktar = scanner.nextDouble();
                    if (miktar > 0 && miktar <= bakiye) {
                        bakiye -= miktar;
                        System.out.println("Para gönderildi. Yeni bakiyeniz: " + bakiye + " TL");
                    } else {
                        System.out.println("Yetersiz bakiye veya geçersiz tutar.");
                    }
                } else {
                    System.out.println("Geçersiz IBAN.");
                }
            } else if (secim == 5) {
                // Şifre Değiştirme
                scanner.nextLine();  // Yeni satırı temizle
                System.out.print("Mevcut şifrenizi giriniz: ");
                String mevcutSifre = scanner.nextLine();

                if (mevcutSifre.equals(kullaniciSifre)) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String yeniSifre = scanner.nextLine();

                    System.out.print("Yeni şifrenizi tekrar giriniz: ");
                    String yeniSifreTekrar = scanner.nextLine();

                    if (yeniSifre.equals(yeniSifreTekrar) && yeniSifre.length() >= 4) {
                        kullaniciSifre = yeniSifre;
                        System.out.println("Şifre başarıyla değiştirildi!");
                    } else {
                        System.out.println("Şifreler uyuşmuyor veya geçersiz şifre.");
                    }
                } else {
                    System.out.println("Mevcut şifre hatalı.");
                }
            } else if (secim == 6) {
                // Çıkış
                System.out.println("Çıkış yapılıyor...");
                break;
            } else {
                System.out.println("Geçersiz seçenek.");
            }
        }
    }
}
