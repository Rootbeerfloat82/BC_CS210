import java.io.*;
import java.util.*;


public class testingggg {

   public static void main(String[] args) {
   
      int[] numbers = new int[6];
      
      numbers[1] = 4;
      numbers[3] = 104;
      numbers[5] = 2;
      numbers[5] += numbers[1];
      int x = numbers[1];
      numbers[x] = 44;
      
      System.out.println(Arrays.toString(numbers));
      
   }
}