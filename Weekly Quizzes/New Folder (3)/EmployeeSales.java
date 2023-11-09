/* Ethan Leonard, CS 210, 07/27/2023, In this program, I have created multiple different
a method that takes a file as input and uses a scanner to read the file and determine
total sales and monthly average of company employees. */

import java.io.*;
import java.util.*;

public class EmployeeSales {
   
   // Main method that gets file and calls other method
   public static void main(String[] args) throws FileNotFoundException {
        
      Scanner consoleInput  = new Scanner(System.in);
      System.out.println("Enter the name of the Employee data file: ");
      String inputFile = consoleInput.next();
      Scanner fileInput = new Scanner(new File(inputFile));
               
      printSalesAverage(fileInput);
   }
   
    // This method takes file as input and determines total and monthly average sales
   public static void printSalesAverage(Scanner s) {
      
      while (s.hasNextLine()) {
         String line = s.nextLine();
         Scanner liner = new Scanner(line);
         
         String name = liner.next();
         
         double sales = 0.00;
         int months = 0;
         
         while (liner.hasNext()) {
            String month = liner.next();
            sales+= liner.nextDouble();
            months++;
         }
         
         double monthlyAverage = sales/months;
         
         System.out.printf("Employee: %s Total Sales: %.2f Monthly Average: %.2f\n", name, sales, monthlyAverage); 
         
      }
   }
}        
