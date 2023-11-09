import java.util.*;


public class testing {

   public static void main(String[] args) {
      int[] a1 = {5, 2, 4, 9, 3, 6, 2, 1, 11, 1, 10, 4, 7, 3};
      System.out.println(evenBeforeOdd(a1));
   }
   
   public static int[] evenBeforeOdd(int[] list) {
       
       int temp = 0;
       
       for (int i = 0; i < list.length - 1; i++) {
           
           if (list[i] % 2 == 0 && i != 0) {
               
               temp = list[i];
               
               list[i] = list[i+1];
               
               list[i+1] = temp;
               
           }
       }
       
       return list;
   }
}