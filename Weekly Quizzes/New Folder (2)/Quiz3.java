/* Ethan Leonard, CS 210, 07/13/2023, In this program, I have created multiple different
methods in order to determine the highest value of a set of three integars as well as 
reverse a string and print it all with all of the chars' indexes after the chars */

public class Quiz3 {

   // This is the main method and it calls and sends the parameters to the other methods
   public static void main (String args[]) {
      System.out.println(maxOfThree(8, -4, 5));  // 8
      System.out.println(reverseIndexed("abcd"));   // d3c2b1a0
   }

    // complete code below here, to provide these two methods
   
   // This is the max method, it determines the highest value of three ints using Math.max()
   public static int maxOfThree(int int1, int int2, int int3) {
      
      return Math.max(int1, Math.max(int2, int3));
   }   
   
   // This is the string reversal method, it reverses the string and prints it out with indexes
   public static String reverseIndexed(String s) {
      
      String reversed = "";
      
      for (int i = s.length() - 1; i >= 0; i--) {
         reversed+=s.charAt(i);
         reversed+=i;
      }
      
      return reversed;
   }
}