/* 
 * CS210 Chapter 01 (Methods - Sequence Puzzle)
 * Add your name, date, quarter 
 * Ethan Leonard, CS210, 07/06/2023, In this puzzle, I have to add calls 
 * inside different methods in order to get the desired output in the desired order.
 * This program is a short puzzle.
 * Change the method definitions to get below desired output by following
 * these rules:
 * - You can change only first(), second() or third() method definitions.
 * - You cannot change the main method.
 * - You cannot add or change any System.out.println calls, you can only add calls to other methods.
 * Desired output:
 
first method
third method
second method
second method
third method
second method
second method
third method
second method
 
 */

public class Puzzle {

   public static void first() {
      // Can change this method
      // Can only add calls to other methods
      System.out.println("first method");
      third();
      second();
   }

   public static void second() {
      // Can change this method
      // Can only add calls to other methods
      System.out.println("second method"); 
   }
 
   public static void third() {
      // Can change this method
      // Can only add calls to other methods
      System.out.println("third method");
      second();
   } 
 
   public static void main(String[] args) {
    // DO NOT change this main method
      first();
      third();
      second();
      third();
    // DO NOT change this main method
   }

}


// Desired output:
//
// first method
// third method
// second method
// second method
// third method
// second method
// second method
// third method
// second method
