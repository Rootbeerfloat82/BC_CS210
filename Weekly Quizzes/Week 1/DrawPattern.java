/* Ethan Leonard CS210 7/6/23 this program uses methods in order to draw a 
picture of rockets

* This program draws a picture of rockets.
* Modify the program by defining and using additional static methods.
* Add minimum of 3 such static methods to eliminate the redundancy. Make
sure there is no code duplication.
* The main( ) method should contain only method calls. No
System.out.println calls.
* Make sure your revised program producesexact same outputas the original
program including spaces.
*/
public class DrawPattern {
   
   // Main method that calls all the methods that build the rocket ships
   public static void main(String[] args) {
      topAndBottom();
      hull();
      body();
      hull();
      topAndBottom();
   }
   
   // Builds 1 top and 1 bottom for the ships
   public static void topAndBottom() {
      System.out.println("   /\\     \\    /\n  /  \\     \\  /\n /    \\     \\/");
   }
   
   // Builds the hulls for the ships
   public static void hull() {
      System.out.println("+------+ +------+ \n|      | |      | \n|      | |      | \n+------+ +------+ ");
   }
   
   // Builds the bodies for the ships
   public static void body() {
      System.out.println("| 6996 | | 9669 | ");
   }
}


