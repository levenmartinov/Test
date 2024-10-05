package arrarys;

public class Task06 {
    public static void main(String[] args) {

        /*TASK :
        write a java program to find the second largest number in the array?
        Maximum and minimum number in the array?
        (Dizideki en büyük ikinci sayyiyi, maksimum ve minimum sayiyi
        bulmak için bir java programi yazin)

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        */

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        //  Arrays.sort(arr);
        //  System.out.println("min="+ arr[0] + " ve " + "max="+ arr[arr.length-1]);

        int min = arr[0];
        int max = arr[0];
        int secondMax=arr[0];

        for (int i = 0; i < arr.length ; i++)
        {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);

            if (arr[i]>secondMax && arr[i]<max){
                secondMax=arr[i];
            }

        }
         System.out.println("min değer="+ min +"\nmax değer="+max + "\nikinci max değer="+secondMax);


        //farklı ihtimalleri if koşulu ile belirttim, üstteki yorum satırına kadar sorunun çözümü için yeterli.
       // if (min==max)
       // {
       //     System.out.println("Dizi içindeki tüm değerler aynıdır");
       //     System.out.println("min değer="+ min +"\nmax değer="+max + "\nikinci max değer="+secondMax);
       // } else if (min==secondMax) {
       //     System.out.println("Dizi içerisinde sadece iki farklı değer vardır,\n bu nedenle ikinci max değer ile min değer aynıdır.");
       //     System.out.println("min değer="+ min +"\nmax değer="+max + "\nikinci max değer="+secondMax);
//
       // }else {
       //     System.out.println("min değer="+ min +"\nmax değer="+max + "\nikinci max değer="+secondMax);
       // }



    }
}
