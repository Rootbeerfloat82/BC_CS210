/* Ethan Leonard, CS 210, 07/09/2023, In this program, I have created multiple different
methods in order to create an image of the Space Needle using print statements and for
loops */

public class SpaceNeedle {
   
   // This is class constant or variable that controls the height 
   public static final int HEIGHT = 5;
   
   // This is the method that creates what is the needle and also stem of the Space Needle
   public static void stem() {
      for (int j = 0; j < HEIGHT; j++) {
         
         for (int i = 0; i <= (HEIGHT*3)-1; i++) {
            System.out.print(" ");
         }
         
         System.out.println("||");
         
      }
      
   }
   
   // This method creates the top circle of the space needle, but no needle
   public static void top() {
      for (int i = 0; i < HEIGHT; i++) {
         
         for (int j = 1; j <= ((HEIGHT * 3)-3) - (i*3); j++) {
            System.out.print(" ");
         }
         
         System.out.print("__/");
         
         for (int j = 0; j <= i-1; j++) {
            System.out.print(":::");
         }
         
         System.out.print("||");
         
         for (int j = 0; j <= i-1; j++) {
            System.out.print(":::");
         }
         
         System.out.println("\\__");
      }
      
      System.out.print("|");
      
      for (int i = 0; i < (HEIGHT * 6); i++) {
         System.out.print("\"");
      }
      
      System.out.println("|");
          
   }
   
   // This creates the bottom circle of the space needle
   public static void bottom() {
      for (int i = 0; i < HEIGHT; i++) {
         for (int j = 0; j < i; j++) {
            System.out.print("  ");
         }
         
         System.out.print("\\_/");
         
         for (int j = 1; j <= (((HEIGHT * 6)-4) - (i*4)) / 2; j++) {
            System.out.print("\\/");
         }
         
         System.out.println("\\_/");
      }
   }
   
   // This creates the big rod of the Space Needle and can have its height adjusted
   public static void rod() {
      for (int i = 0; i < (HEIGHT * HEIGHT); i++) {
         for (int j = 0; j < ((HEIGHT*3)-3); j++) {
            System.out.print(" ");
         }
         
         for (int j = 0; j < 2; j++) {
            System.out.print("|%%|");
         }
         
         System.out.println();
       }
   }
   
   // This is the main method that calls all the other methods and creates the Space Needle
   public static void main(String[] args) {
      stem();
      top();
      bottom();
      stem();
      rod();
      top();
   }
   

}