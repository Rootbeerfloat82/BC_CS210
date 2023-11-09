/* Ethan Leonard, CS 210, 07/26/2023, In this program, I have created multiple different
methods to take a file as input and translate the text to pigLatin in a new file. */

import java.io.*;
import java.util.*;


public class PigLatinTranslator {
   
   // this is the main method. It creates the scanners and PrintStream and prompts for file
   public static void main(String[] args) throws FileNotFoundException {
      Scanner console = new Scanner(System.in);
      
      System.out.print("Name of input file: ");
      
      String fileName = console.next();
      
      Scanner input = new Scanner(new File(fileName + ".txt"));
      
      PrintStream output = new PrintStream(new File(fileName + "-PL.txt"));
      
      pigLatin(input, output);
   }
   
   // This method sends of words from the input file to be translated and writes to output
   public static void pigLatin(Scanner input, PrintStream output) {
      
      while (input.hasNextLine()) {
         String line = input.nextLine();
         
         Scanner liner = new Scanner(line);
         
         if (liner.hasNext()) {
         
            String word = liner.next();
               
            word = editor(word);
               
            word = pig(word);
         
            while (word == "") {
           
               word = liner.next();
               
               word = editor(word);
               
               word = pig(word);
            }    
               
            output.print(word); 
            
            while (liner.hasNext()) {  
               word = liner.next(); 
               word = editor(word);
               word = pig(word);
               
               if (!word.equals("")) {        
                  output.print(" " + word);
               }
                 
            }
            
         } 
        output.println();
     }
   }
   
   // This method removes numbers and punctiation as well as makes the words lowercase
   public static String editor(String word) {
   
      String newWord = "";
      
      for (int i = 0; i < word.length(); i++) {
         
         char x = word.charAt(i);
         
         if (Character.isDigit(x)) {
            return "";
         }
         
         if (x != '!' && x != '?' && x != '.' && x !=',') {
            newWord += x;
         }
      } 
      return newWord.toLowerCase();
   }   
   
   // This method translates the word to pigLatin using the specifications 
   public static String pig(String word) {
      
      if (!word.equals("")) {
         char x = word.charAt(0);
         
         String newWord = "";
         
         if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
            newWord = word + "way";
            return newWord;
         } else {
            int i = 0;
            
            while (i < word.length() && word.charAt(i) != 'a' && word.charAt(i) != 'e' && word.charAt(i) != 'i' && word.charAt(i) != 'o' && word.charAt(i) != 'u') {
               newWord+= word.charAt(i);
               i++;
            }
     
            newWord = word.substring(i, (word.length())) + newWord + "ay";
            return newWord;
         }   
      } else {
         return "";
      }
   }
      
}