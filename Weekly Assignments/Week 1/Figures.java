/* Ethan Leonard, CS 210, 07/06/2023, In this program, I have created multiple different
methods in order to create three unique figures known as tree, wineglass and star */

public class Figures {
   
   // Creates top of triangle 
   public static void topTriangle() {
      System.out.println("    *\n   /*\\\n  //*\\\\\n ///*\\\\\\\n////*\\\\\\\\");
   }
   
   // Creates bottom of triangle 
   public static void bottomTriangle() {
      System.out.println("\\\\\\\\*////\n \\\\\\*///\n  \\\\*//\n   \\*/\n    *");
   }
   
   // Creates stem for tree and wineglass 
   public static void stem() {
      System.out.println("    *\n    *\n   ***");
   }
   
   // Creates diamond figure by calling other functions 
   public static void diamond() {
      topTriangle();
      bottomTriangle();
      System.out.println();
   }
   
   // Creates wineglass figure by calling other methods 
   public static void wineglass() {
      bottomTriangle();
      stem();
      System.out.println();
   }
   
   // Creates tree figure by calling other methods 
   public static void tree() {
      topTriangle();
      stem();
      System.out.println();
   }
   
   // Main method that calls all the other method and is resposible for the creation of all the figures 
   public static void main(String[] args) {
      diamond();
      wineglass();
      tree();
   }
   
}

      System.out.println("   /\\     \\    /");
      System.out.println("  /  \\     \\  /");
      System.out.println(" /    \\     \\/");
      System.out.println("+------+ +------+ ");
      System.out.println("|      | |      | ");
      System.out.println("|      | |      | ");
      System.out.println("+------+ +------+ ");
      System.out.println("| 6996 | | 9669 | ");
      System.out.println("+------+ +------+ ");
      System.out.println("|      | |      | ");
      System.out.println("|      | |      | ");
      System.out.println("+------+ +------+ ");
      System.out.println("   /\\     \\    /");
      System.out.println("  /  \\     \\  /");
      System.out.println(" /    \\     \\/");