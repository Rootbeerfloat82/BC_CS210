/* Ethan Leonard, CS 210, 07/10/2023, In this program, I have created multiple different
methods in to create an pattern image of * and integers */


public class PrintPattern {

   // This is the main method. It calls all the otehr methods that create the pattern
   public static void main (String args[]) {
       patternDown(); // write nested loop to print a 5 top lines as shown below
       patternUp();   // write another nested loop, omit the line with single number 1 so it's shared
   }
   // your complete code will follow....
   
   
   // This is the top of the pattern method. It creates the top of the pattern
   public static void patternDown() {
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < (i + 2); j++) {
            System.out.print("*");
         }
         
         for (int j = 1; j <= (9-(2*i)); j++) {
            System.out.print(j);
         }
         
         for (int j = 0; j < (i + 2); j++) {
            System.out.print("*");
         }
         
         System.out.println();
      }   
   }
   
   // This is the bottom of the pattern method. It creates the bottom of the pattern.
   public static void patternUp() {
      for (int i = 0; i < 4; i++) {
         for (int j = 0; j < (5 - i) ; j++) {
            System.out.print("*");
         }
         
         for (int j = 1; j <= ((i * 2) + 3); j++) {
            System.out.print(j);
         }
         
         for (int j = 0; j < (5 - i) ; j++) {
            System.out.print("*");
         }
         
         System.out.println();
      }   
   }

}