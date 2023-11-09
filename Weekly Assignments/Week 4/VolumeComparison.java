/* Ethan Leonard, CS 210, 07/12/2023, In this program, I have created multiple different
methods in order to create a program that takes two shapes as input as well as their
dimensions and completes a series of calculations to determine the volumes of both
shapes as well as which one is bigger. */


import java.util.*;

public class VolumeComparison {
   
   // This is the method that prompts the user for the type of shape and gives it to main
   public static String getShapeType(Scanner console) {
      
      System.out.print("Please choose your shape (box, cone, or sphere): ");
      
      String type = console.next();
      
      type = type.toLowerCase();
      
      return type;
   }
   
   // This is the method that promts user for dimensions of box and finds volume
   public static double promptCalculatePrintBoxVolume(Scanner console) {
      
      System.out.print("Specify box width: ");
      
      double d1 = console.nextDouble();
      
      System.out.print("Specify box depth: ");

      double d2 = console.nextDouble();
      
      System.out.print("Specify box height: ");
      
      double d3 = console.nextDouble();
      
      double volume = d1 * d2 * d3;
      
      System.out.printf("The volume of the box is (%.3f) cube units.\n\n", volume);
      
      return volume;
   }
   
   // This is the method that promts user for dimensions of cone and finds volume
   public static double promptCalculatePrintConeVolume(Scanner console) {
      
      System.out.print("Specify cone radius: ");
      
      double d1 = console.nextDouble();
      
      System.out.print("Specify cone height: ");

      double d2 = console.nextDouble();
            
      double volume = Math.PI * (d1 * d1) * (d2 / 3);
      
      System.out.printf("The volume of the cone is (%.3f) cube units.\n\n", volume);
      
      return volume;
   }
   
   // This is the method that promts user for dimensions of sphere and finds volume
   public static double promptCalculatePrintSphereVolume(Scanner console) {
      System.out.print("Specify sphere radius: ");
      
      double d1 = console.nextDouble();
                  
      double volume = ((Math.PI * (Math.pow(d1, 3))) * (4)) / 3;
      
      System.out.printf("The volume of the sphere is (%.3f) cube units.\n\n", volume);
      
      return volume;
      
   }
   
   // This method takes the shape type as input and then calls the respective method in order to calculate and return its volume
   public static double promptCalculateVolume(String input, Scanner console) {

      input = input.toLowerCase();
      
      if (input.equals("box") == true) {
         return promptCalculatePrintBoxVolume(console);
      } else if (input.equals("cone") == true) {
         return promptCalculatePrintConeVolume(console);
      } else if (input.equals("sphere") == true) {
         return promptCalculatePrintSphereVolume(console);
      } else {
         throw new IllegalArgumentException("Invalid Shape"); 
      }    
   }
   
   // This is the main method. It calls all the other functions as well as prompts the user for the shape types and does the comparison. 
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      
      String type1 = getShapeType(console);  
      double v1 = promptCalculateVolume(type1, console);
      String type2 = getShapeType(console);  
      double v2 = promptCalculateVolume(type2, console);
      
      if (v1 > v2) {
         System.out.printf("The volume of the %s (%.3f cubic units) is greater than the volume of the %s (%.3f cubic units).", type1, v1, type2, v2);
      } else if (v1 == v2) {
         System.out.printf("The volume of the %s (%.3f cubic units) is equal to the volume of the %s (%.3f cubic units).", type1, v1, type2, v2);
      } else {
         System.out.printf("The volume of the %s (%.3f cubic units) is less than the volume of the %s (%.3f cubic units).", type1, v1, type2, v2);
      }
      
   }
}
      