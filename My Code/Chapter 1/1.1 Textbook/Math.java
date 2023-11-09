import java.util.*;
public class Math {

   
   
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Number: ");
      
      int n = console.nextInt();
      
      int sum = 0;
      
      for (int i = 0; i < n; i++) {
         int g = console.nextInt();
         sum+=g;
      }
      
      System.out.println(sum);
         
      
      
   }
}