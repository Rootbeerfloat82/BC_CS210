public class ifElseMystery {

   public static void main(String[] agrs) {
      mystery(25);
      mystery(10);  
      mystery(-6);
   }
   
   public static void mystery(int n) {
      System.out.print(n + " "); 
      
      if (n > 10) {
         n = n / 2;
      } else if (n < 10) {
         n = n * 2;
      }
      
      if (n % 2 == 1) {
         n++;
      } else {
         n--;
      }
      
      System.out.println(n);
      
   }
} 