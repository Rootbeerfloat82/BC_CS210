/* Ethan Leonard, CS 210, 07/20/2023, In this program, I have created multiple different
methods to create a mystery word until it creates quiz and to check if an int has a 
positive digit */


import java.util.*;

public class Quiz5 {
   
   // Takes length of word as input and creates random words until it makes QUIZ
   public static String mysteryWord(int n) {
      Random r = new Random();
      
      String word = "";
      
      int i = 0;
      
      while (i < n) {
         word += (char)(r.nextInt(26) + 65);
         i++;
      }
      
      return word;
   }
   
   // Takes int as input and checks if it has an even digit
   public static boolean hasAnEvenDigit(int n) {
      
      boolean evenDig = false;
      
      while (n > 0) { 
         if (n % 2 == 1) {
            n /= 10;
         } else {
            evenDig = true;
            return evenDig;
         }
      }
      
      return evenDig;
   }
   
   
   // Main method. Calls other methods and provides them with input
   public static void main(String[] args) {
      String thing = mysteryWord(4);
      System.out.println(thing); // "SDTL" on my first test
      do {
         thing = mysteryWord(4); 
      } while (!thing.equals("QUIZ"));
      System.out.println(thing); // ultimately I get "QUIZ"

      System.out.println("hasAnEvenDigit(45889) returns " + hasAnEvenDigit(45889)); //Should be true
      System.out.println("hasAnEvenDigit(317) returns " + hasAnEvenDigit(317)); //Should be false
      System.out.println("hasAnEvenDigit(307) returns " + hasAnEvenDigit(307)); //Should be true
   }
}