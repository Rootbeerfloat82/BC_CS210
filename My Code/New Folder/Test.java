public class Test {

   public static void main(String[] args) {
   
      int x = -37;
      
      int a = 1;
      int c = 0;
      
      while (x > 0) {
         a = x % 2;
         if (a == 1) {
            c++;
         }
         
         x = x/2;
      }
      
      System.out.println(c);
   }
}