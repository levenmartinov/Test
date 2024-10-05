package arrarys;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

         /* TASK :
         kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
         ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
         java code create ediniz.

         */
/*
        Scanner scan = new Scanner(System.in);

        System.out.println("Array için eleman sayısı giriniz.");
        int elmnSayisi = scan.nextInt();
        int[] nums = new int[elmnSayisi];


        for (int i = 0; i < elmnSayisi; i++)
        {
            System.out.println(i+1 +". değeri giriniz");
            int num = scan.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("max ile min farki: "+(nums[nums.length-1]-nums[0]));
*/

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin kaç elemanlı olacağını alıyoruz
        System.out.print("Kaç elemanlı bir dizi oluşturmak istiyorsunuz? ");
        int n = scanner.nextInt();

        // Kullanıcının belirlediği boyutta bir int dizisi oluşturuyoruz
        int[] array = new int[n];

        // Kullanıcıdan dizinin elemanlarını girmesini istiyoruz
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Dizideki en küçük ve en büyük elemanları buluyoruz
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        // En büyük ve en küçük elemanlar arasındaki farkı hesaplıyoruz
        int fark = max - min;

        // Sonucu ekrana yazdırıyoruz
        System.out.println("En büyük eleman ile en küçük eleman arasındaki fark: " + fark);



    }
}
