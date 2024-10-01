package study;

public class test_01 {
    public static void main(String[] args) {


/*        int i = 1;

        int product = 1;

        while (i <= 4) {



            product = product * i;

            i++;

            System.out.println(product);



        }*/

/*        int m = 10;

        int n = 2;

        int sum = 0;



        while(m>n){



            m--;

            n = n + 2;

            sum = sum + m + n;



        }



        System.out.println(sum);*/

/*        int num = 0;



        do {



            if (num % 2 == 0) {

                num += 2;              // num = num + 2 demektir

            }



        } while (num < 7);



        System.out.println(num);*/

        //String s = "Marra";



 /*       for (int i = s.length() - 1; i >= 0; i--) {



            String c = s.substring(i, i + 1);



            if (s.indexOf(c) == s.lastIndexOf(c)) {

                System.out.println(c);

            }

        }*/

      /*  int y = 1;



        for (int i = 0; i < 4; i++) {

            y = y + i;

        }

        System.out.println(y);*/


/*
       int j2 = 1;
       while(j2<=10){
           System.out.println(j2);
           j2++;
       }

        System.out.println("!----------------------------");
         int j4 = 1;
         while(j4<11){
             System.out.println(j4);
             j4++;
         }
        System.out.println("---------------------")
*/

/*        String s = "Apex";
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        System.out.println(result);*/

   /*     for(int j=10; j>0; j++){

            System.out.println("Hello");

        }*/


        String result = "";

        for (int i = 1; i < 4; i++) {

            for (int j = (5 - i); j > 1; j--) {
                result = result + (i + j);
            }
            System.out.println(result);
            result = "";
        }


    }
}
