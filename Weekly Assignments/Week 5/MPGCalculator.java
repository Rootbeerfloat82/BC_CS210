/* Ethan Leonard, CS 210, 07/19/2023, In this program, I have created multiple different
methods calculate the MPG for a vehicle on a multi-leg journey. */

import java.util.*;

public class MPGCalculator {
   
   // This is the variable used to track the number of legs
   public static int leg = 0;
   
   // Main method - calls all the other methods and creates the scanner
   public static void main(String[] agrs) {
      Scanner console = new Scanner(System.in);
      
      userWelcome();
      
      double startMiles = startOdometer(console);
      double intial = startMiles;
      double endMiles = 0.0;
      
      dashLine();
      
      boolean more = true;
      
      double fuel = 0.0;
      double fuelTotal = 0.0;
      
      double MPG = 0.0;
      
      while (more) {
         printLeg();
         endMiles = endOdometer(startMiles, console);
         fuel = fuelConsumed(console);
         fuelTotal += fuel;
         MPG = MGPCalc(startMiles,endMiles, fuel);
         printMPG(MPG);
         more = YorN(console);
         startMiles = endMiles;
         dashLine();
      }
      
      MPG = MGPCalc(intial, endMiles, fuelTotal);
      conclusion(MPG);
   }
   
   // Prints a welcome message to user
   public static void userWelcome() {
      System.out.println("Welcome to the MPG Calculator for multi-leg journey\n");
   }
   
   // Prints the MPG rounded to second decimal
   public static void printMPG(double MPG) {
      System.out.printf("MPG for leg#%d = %.2f\n", leg, MPG);
   }
   
   // Prints a dashed line used as a break
   public static void dashLine() {
      System.out.println("---------------------------------------------------");
   }
   
   // Calls another function to get starting Odometer amount
   public static double startOdometer(Scanner console) {
      return getMinimumDouble(0.0, "Please enter a starting odometer reading: ", "Please enter a value greater than 0.0", console);
   }
   // Calls another function to get ending Odometer amount
   public static double endOdometer(double startMiles, Scanner console) {
      return getMinimumDouble(startMiles, "Odometer reading at the end: ", "Please enter a value greater than " + startMiles, console);
   }  
   
   // Calls another function to get the fuel consumed
   public static double fuelConsumed(Scanner console) {
      return getMinimumDouble(0.0, "Fuel consumed in gallons: ", "Please enter a value greater than 0.0", console);
   } 
   
   // Prints out the conclusion for the trip to the user
   public static void conclusion(double MPG) {
      System.out.println("Total number of legs in the journey: " + leg);
      System.out.printf("Final MPG for the entire journey: %.2f\n", MPG);
      System.out.println("Bye!");
   } 
   
   // Checks to see if user has another leg and makes sure they input y or n
   public static boolean YorN(Scanner console) {
      System.out.print("Continue (y/n)? ");
            
      char n = console.next().charAt(0);
      
      while (n != 'y' && n != 'n') {
         System.out.println("Please enter y or n.");
         System.out.print("Continue (y/n)? ");
         n = console.next().charAt(0);
      }
      
      if (n == 'y') {
         return true;
      } else {
         return false;
      }
      
   } 
   
   // Calculates the MPG for leg of trip
   public static double MGPCalc(double startMiles, double endMiles, double fuel) {  
       double MPG = (endMiles - startMiles) / fuel;
       return MPG;
   } 
   
   // Takes in a promt, error, min and gets values from user and checks that they fit the requirments
   public static double getMinimumDouble(double min, String prompt, String error, Scanner console) {
      System.out.print(prompt);
            
      double n = console.nextDouble();
      
      while (n <= min) {
         System.out.println(error);
         System.out.print(prompt);
         n = console.nextDouble();
      }
      
      return n;
   }
   
   // Prints out the leg count and adds to it
   public static void printLeg() {     
      leg++;
      System.out.println("Data for leg#" + leg);
      
   }
}