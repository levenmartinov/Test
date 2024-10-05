package arrarys;

public class Task05 {
    public static void main(String[] args) {

        /*  TASK :

          (dizi elemanlarinin ortalama degerini hesaplayan ve
          ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
          input[]= {1,2,3,4,5,6,7}
          Output : 4
         */

  /*      int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int ort = 0;
        int sum = 0;

        for (int w : nums) {
            sum = sum + w;
        }
        ort = ort + sum / nums.length;
        System.out.println(ort);
        for (int w : nums) {
            if (w > ort) {
                System.out.print(w + " ");
            }
        }  //4
           //5 6 7*/

        //Verilen dizi
        int[] input = {1, 2, 3, 4, 5, 6, 7};

        //Ortalamayi hesaplamak icin toplam degiskeni tanimliyoruz
        int toplam = 0;

        //Dizideki tum elemanlarin topmalimini hesapliyoruz
        for (int i = 0; i < input.length; i++) {
            toplam += input[i]; //Her bir elemani toplayarak toplami guncelliyoruz
        }

        //Dizinin eleman sayisini aliyoruz
        int elemanSayisi = input.length;

        //Ortalamayi tam sayi olarak hesapliyoruz
        int ortalama = toplam / elemanSayisi; // Tam sayi olarak ortalamayi hesapliyoruz

        //Ortalamdan buyuk olan elemanlari yazdiriyoruz
        System.out.println("Ortalama: " + ortalama); //4
        System.out.println("Ortalamadan buyuk olan elemanlar: ");

        for (int i = 0; i < input.length; i++) {
            if (input[i] > ortalama) { //Eger eleman ortalamdan buyukse
                System.out.print(input[i] + " ");  //5 6 7
            }
        }






    }
}
