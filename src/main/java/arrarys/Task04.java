package arrarys;

public class Task04 {

    public static void main(String[] args) {

        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

/*        int[] nums = new int[]{5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(nums[i]+nums[j]==istenenToplam)
                {
                    System.out.println(nums[i] + " ile "+nums[j]);
                }
            }
        }*/

        //Verilen in array ve istenen toplma
        int[] arr = {5, 7, -6, 4, 2, 15, 3, 8, 1};
        int istenenToplam = 9;

        //Her iki elmani karsilastirarak ciftleri buluyoruz
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == istenenToplam) {

                    //Eger toplam istenen degere esitse sonucu yazdiririz

                    System.out.println(arr[i] + " ve " + arr[j] + " toplami: " + istenenToplam);
                }
            }
        }

    }

}
