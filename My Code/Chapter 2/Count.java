public class Count {
   public static void main(String[] args) {
   
      int number1 = 1;
      int number2 = 1;
      
      System.out.print(number1 + " ");
      System.out.print(number2 + " ");
   
      for (int z = 2; z <= 144; z = number1 + number2) {
         System.out.print(z + " ");
         number1 = number2;
         number2 = z;            
      }
   }
}