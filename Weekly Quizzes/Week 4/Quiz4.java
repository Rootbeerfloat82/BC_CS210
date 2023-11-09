/* Ethan Leonard, CS 210, 07/17/2023, In this program, I have created multiple different
methods in order to create a program can find partial sums of a series and the hourly pay
for a baby sitter */

public class Quiz4 {
   
   
   // This method takes int n as input and finds the partial sum of the series
   public static double getResult(int n) {
   
      double sum = 0.0;
      
      for (int i = 1; i <= n; i++) {
         
         sum += (Math.pow(-1, i) / Math.pow(i, 2));
      }
      
      return sum; 
   }
   
   // This method takes hours and rate as input and determines the pay for the babysitter
   public static double charges(int hours, double hourlyRate) {
   
      double total = 0.0;
   
      for (int i = 1; i <= hours; i++) {
      
         if (i <= 4) {
            total+= hourlyRate;
         } else {
            total+= (0.8 * hourlyRate);
         }
      }
      
      return total;
   }
   
   // This is the main method and it calls and sends input to the other methods
   public static void main(String[] args) {
      System.out.println(getResult(8));
      System.out.println(getResult(888));
      System.out.println(getResult(88888));
      
      System.out.println(charges(2, 20.5));
      System.out.println(charges(5, 20.5));
      System.out.println(charges(3, 17.75));
      System.out.println(charges(7, 17.75));
   }
}
         
