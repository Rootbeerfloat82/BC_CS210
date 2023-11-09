/* Ethan Leonard, CS 210, 07/12/2023, In this program, I have created multiple different
methods in order to create a program that takes date and weight of coffee as input and
outputs a table for a few days of prices including tax */

import java.util.*;

public class CoffeeShopInvoice {
    
    // Class constantg that controls the width of columns 
   public static final int COL_WIDTH = 15;
   
   // This method "pads" the strings by adding space so right aligned
   public static String padString(String s, int num) {
      
      String newer = s;
      
      for (int i = s.length() + 1; i <= num; i++) {
         newer = " " + newer;
      }
      
      return newer;
   }
   
   // This method prints the AM coffee logo
   public static void printLogo() {
      
      int stars = (COL_WIDTH * 3) + 1;
      
      for (int i = 0; i <= stars; i++) {
         
         System.out.print("*");
      }
      
      System.out.println();
      
      System.out.println("Welcome to AM Coffee shop");
      
      for (int i = 0; i <= stars; i++) {
         
         System.out.print("*");
      } 
      
      System.out.println();
      
      System.out.print("     /\\       |\\    /|\n    /  \\      | \\  / |\n   /    \\     |  \\/  |\n  /------\\    |      |\n /        \\   |      |\n/          \\  |      |\n");
      
      for (int i = 0; i <= stars; i++) {
         
         System.out.print("*");
      }
      
      System.out.println();
   }
   
   // This method rounds doubles to the second decimal
   public static double roundTo2Decimal(double num) {
      return Math.round(num * 100.0) / 100.0;
   }    
   
   // This method calculates the shipping cost based on lbs
   public static double calculateShippingCost(double lbs) {
      return roundTo2Decimal((0.65 * lbs) + 2.50);
   }
   
   // This method calculates the cost of coffee based on lbs
   public static double calculateCostOfCoffee(double lbs) {
      return roundTo2Decimal(9.50 * lbs);
   }
   
   // This method calculates the tax based on cost and date
   public static double calculateTax(int date, double cost) {
      double days = 31 - date;
      double rate = days / 500;
      double tax = cost * rate;
      return roundTo2Decimal(tax);
   }
   
   // This method creates the invoice by using date, lbs, and the other methods
   public static void printInvoice(int date, double lbs) {
   
      System.out.println();
   
      int stars = (COL_WIDTH * 3) + 1;
      
      double shCost = calculateShippingCost(lbs);
      
      System.out.println("Shipping Cost: $" + shCost);
      
      double cofCost = calculateCostOfCoffee(lbs);
      
      System.out.println("Cost of Coffee: $" + cofCost);
      
      for (int i = 0; i <= stars; i++) {
         
         System.out.print("*");
      }
      
      System.out.println();
      
      for (int j = 0; j <= 2; j++) {
         for (int i = 0; i < COL_WIDTH; i++) {
            System.out.print("=");
         }
         System.out.print(" ");
      }
      
      System.out.println();
      System.out.print(padString("Date", COL_WIDTH));
      System.out.print(" ");
      System.out.print(padString("Tax", COL_WIDTH)); 
      System.out.print(" "); 
      System.out.println(padString("Total", COL_WIDTH)); 
     
      
      for (int j = 0; j <= 2; j++) {
         for (int i = 0; i < COL_WIDTH; i++) {
            System.out.print("=");
         }
         System.out.print(" ");
      }
      
      System.out.println();
      
      System.out.print(padString(String.valueOf(date), COL_WIDTH));
      System.out.print(" ");
      System.out.print(padString("$"+String.valueOf(calculateTax(date, cofCost)), COL_WIDTH));
      System.out.print(" ");
      
      double total = roundTo2Decimal(calculateTax(date, cofCost) + shCost + cofCost);
      String totaly = String.valueOf(total);
      System.out.println(padString(("$"+totaly), COL_WIDTH));
      
      for (int j = 0; j <= 2; j++) {
         for (int i = 0; i < COL_WIDTH; i++) {
            System.out.print("=");
         }
         System.out.print(" ");
      }
      
      System.out.println();
      
      System.out.print(padString(String.valueOf(date + 1), COL_WIDTH));
      System.out.print(" ");
      System.out.print(padString("$"+String.valueOf(calculateTax((date + 1), cofCost)), COL_WIDTH));
      System.out.print(" ");
      
      total = roundTo2Decimal(calculateTax((date + 1), cofCost) + shCost + cofCost);
      totaly = String.valueOf(total);
      System.out.println(padString(("$"+totaly), COL_WIDTH));
      
      for (int j = 0; j <= 2; j++) {
         for (int i = 0; i < COL_WIDTH; i++) {
            System.out.print("=");
         }
         System.out.print(" ");
      }
      
      System.out.println();
      
      System.out.print(padString(String.valueOf(date + 2), COL_WIDTH));
      System.out.print(" ");
      System.out.print(padString("$"+String.valueOf(calculateTax((date + 2), cofCost)), COL_WIDTH));
      System.out.print(" ");
      
      total = roundTo2Decimal(calculateTax((date + 2), cofCost) + shCost + cofCost);
      totaly = String.valueOf(total);
      System.out.println(padString(("$"+totaly), COL_WIDTH));
      
      for (int j = 0; j <= 2; j++) {
         for (int i = 0; i < COL_WIDTH; i++) {
            System.out.print("=");
         }
         System.out.print(" ");
      }

   }
   
   // This method calls all the other methods and takes in the input
   public static void main(String[] args) {
      
      Scanner console = new Scanner(System.in);
      
      printLogo();
      
      System.out.print("Enter the date: ");
      
      int date = console.nextInt();
      
      System.out.print("Enter the pounds of coffee: ");
      
      double lbs = console.nextDouble();
      
      int stars = (COL_WIDTH * 3) + 1;
      
      for (int i = 0; i <= stars; i++) {
         
         System.out.print("*");
      } 
      
      printInvoice(date, lbs);
   }  
} 