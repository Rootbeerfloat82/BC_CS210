public class Stairs {
   public static void main(String[] args) {
   
      for (int i = 1; i <= 5; i++) {
      
         for (int j = 5 - i; j >= 0; j--) {
         
            System.out.print(" ");
            
         }
         
         for (int z = 0; z <= i; z++) { 
            System.out.print(i);
         }
         
         System.out.println();
      }
   } 
}  