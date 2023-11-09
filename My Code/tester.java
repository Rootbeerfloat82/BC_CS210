import java.io.*;
import java.util.*;

public class tester {

   public static void main(String[] args) {
      printDuplicates(new Scanner("hello how how are you you you you\n"));
   }


   public static void printDuplicates(Scanner input) {
       
       String word1 = "";
       String word2 = "";
       int count = 0;

       while (input.hasNextLine()) {
           
           Scanner line = new Scanner(input.nextLine());
           
           word1 = line.next();
           
           while (line.hasNext()) {
   
               word2 = line.next();
   
               if (word1.equals(word2)) {
                   count++;
                   
               } if (!word1.equals(word2) && count > 0) {
                   System.out.print(word1 + "*" + count + " ");
                   count = 0;

               } else if (!line.hasNext() && count > 0) {
                  count++;
                  System.out.print(word1 + "*" + count + " ");
                  count = 0;
               }
               
               word1 = word2;
               
           }
           
           System.out.println();
   
       }
       
       
       
       
       
       
       
       
       
       
       
       
       /*
       
       while (input.hasNextLine()) {    
           word1 = input.next();
           word2 = input.next();
           
           if (word1.equals(word2)) {
               count++;
           } else if (!word1.equals(word2) && count > 0) {
               System.out.print(word1 + "*" + count + " ");
               count = 0;
           }
           
       }  */
       
   }
}