package arrarys;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {

        /* TASK :
       bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
       input : 1,2,-3,4,-5,-6
       output :-1,-2,3,-4,5,6
     */

        int[] nums = new int[]{1,2,-3,4,-5,-6};
        int[] yeni = new int[nums.length];
        int idx=0;

        for (int w : nums)
        {
            w=w*(-1);
            yeni[idx]=w;
            idx++;
        }
        System.out.println(Arrays.toString(yeni));




    }
}
