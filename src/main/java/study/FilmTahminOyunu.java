package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahminOyunu {
    static List<String> filmler = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Kullanıcıya film listesinden bir film seçtir
        System.out.println("Lütfen bir film seçmek için 0 ile " + (filmler.size() - 1) + " arasında bir sayı girin:");
        int filmIndex = scanner.nextInt();

        // 2. Filmi al
        String secilenFilm = filmler.get(filmIndex).toUpperCase();
        int filmHarfsayisi = secilenFilm.length();

        // 3. Tahmin hakkı filmin harf sayısının iki katı
        int tahminHakki = filmHarfsayisi * 2;

        // Kullanıcıya filmi bildirmeden, kaç harf olduğunu söyle
        System.out.println("Seçtiğiniz film " + filmHarfsayisi + " harfli.");
        System.out.println("Tahmin hakkınız: " + tahminHakki);

        // Tahmin edilen harfler için başlangıç durumu
        char[] tahminEdilenDurum = new char[filmHarfsayisi];
        Arrays.fill(tahminEdilenDurum, '_'); // Başlangıçta tüm harfler gizli
        int dogruTahmin = 0;
        int yanlisTahmin = 0;

        // 4. Tahmin döngüsü
        while (tahminHakki > 0 && dogruTahmin < filmHarfsayisi) {
            System.out.println("Şu anki tahmin durumu: " + String.valueOf(tahminEdilenDurum));
            System.out.print("Bir harf tahmin edin: ");
            char tahmin = scanner.next().toUpperCase().charAt(0);

            boolean dogruMu = false;
            for (int i = 0; i < secilenFilm.length(); i++) {
                if (secilenFilm.charAt(i) == tahmin && tahminEdilenDurum[i] == '_') {
                    tahminEdilenDurum[i] = tahmin;
                    dogruTahmin++;
                    dogruMu = true;
                }
            }

            if (dogruMu) {
                System.out.println("Doğru tahmin!");
            } else {
                System.out.println("Yanlış tahmin!");
                yanlisTahmin++;
            }

            tahminHakki--;
            System.out.println("Kalan tahmin hakkınız: " + tahminHakki);
            System.out.println("Doğru tahmin sayısı: " + dogruTahmin + ", Yanlış tahmin sayısı: " + yanlisTahmin);
        }

        // 5. Oyun sonucu
        if (dogruTahmin == filmHarfsayisi) {
            System.out.println("Tebrikler! Filmi doğru tahmin ettiniz: " + secilenFilm);
        } else {
            System.out.println("Üzgünüz, tahmin hakkınız bitti. Tahmin etmeniz gereken film: " + secilenFilm);
        }

        scanner.close();
    }
}
