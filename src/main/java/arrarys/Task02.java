package arrarys;

import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {

            /* TASK :
            multidimensional arrayin iç array lerindeki tüm elemanların toplamını birer birer bulan
            ve herbir sonucu yeni bir arrayin elemanı yapan ve yeni array i ekrana yazdıran programı yaziniz.
            input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
               */
/*        int[][] nums = new int[][]{{10, 20, 30}, {4}, {6, 7, 20}};
        System.out.println(Arrays.deepToString(nums));

        int[] yeni = new int[nums.length];
        int index = 0;

        for (int[] w : nums) {
            int sum = 0;

            for (int i = 0; i < w.length; i++) {
                sum = sum + w[i];
            }
            yeni[index] = sum;
            index++;

        }

        System.out.println(Arrays.toString(yeni)); //[60, 4, 33]*/

/*        //Verilen multidimensiol array
        int[][] multiArray = {{10, 20, 30}, {4}, {6, 7, 20}};

        //Sonuclari saklayacagimiz yeni arrayin boyutu, ic array sayisi kadar
        int[] resultArray = new int[multiArray.length];

        //Her bir ic arrayin elemanlarinin toplami hesaplayip yeni arraye ekliyoruz
        for (int i = 0; i < multiArray.length; i++) {
            int sum = 0; //Her bir oc array icin toplami tutmak icin
            for (int j = 0; j < multiArray[i].length; j++) {
                sum += multiArray[i][j]; //ic array elemanlarini topluyoruz
            }
            resultArray[i] = sum; //toplami yeni arrayin i. indexine ekliyoruz
        }

        //Sonuc arrayini ekrana yazdiriyoruz
        System.out.print("Sonuc array : {");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", "); //son elemana kadar virgul ekliyoruz
            }
        }
        System.out.println("}"); //Sonuc array : {60, 4, 33}*/

        // Verilen multidimensional array
        int[][] arr = {{10, 20, 30}, {4}, {6, 7, 20}};

        // Sonuç array'i oluşturuyoruz
        int[] result = new int[arr.length];

        // Her iç array'in toplamını hesaplayıp result array'ine ekliyoruz
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int num : arr[i]) {
                sum += num;
            }
            result[i] = sum;
        }

        // Sonuçları yazdırıyoruz
        for (int sum : result) {
            System.out.print(sum + " ");
        } //60 4 33



    }
}
