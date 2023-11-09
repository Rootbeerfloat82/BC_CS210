/* Ethan Leonard, CS 210, 08/03/2023, In this program, I have created multiple different
methods in order to perform various calculations and two arrays of data concerning temp.

Program to analyze temperature data for a city recorded over some number of days.
The data is stored in two integer arrays of equal length that each store each day's 
low and high temperatures respectively.
Implement two methods: maxTempDrop and evenTemp
*/

public class TempData {
   
   // Main method calls other methods and prints score
   public static void main(String[] args) {
      int[] lowTemp1  = {33, 32, 30, 29, 33, 30, 30, 29, 31};
      int[] highTemp1 = {40, 42, 41, 39, 44, 46, 43, 44, 42 };
      int score = 10; 
   // Part A.
      int diff1 = maxTempDiff(lowTemp1, highTemp1) ;
      if (diff1 == 16) score+=5; 
      else  System.out.println("case "+ 1 + " failed");
   // Part B.
      if (evenTemp(highTemp1)== true ) score+=5;
      else  System.out.println("case "+ 2 + " failed");
      System.out.println(score); 
   }
   
   /* Method returns the maximum temperature difference on a day */
   public static int maxTempDiff(int[] low, int[] high) {
      int maxTempDiff = 0;
      for (int i = 0; i < low.length; i++) {
         int tempDiff = high[i] - low[i];
         if (tempDiff > maxTempDiff) {
            maxTempDiff = tempDiff;
         }
      }      
      return maxTempDiff;
   }
   
   /* Method returns true if the difference in the high temperature for all two consecutive days throughout is 5 or less   */
   public static boolean evenTemp(int[] high) {
      for (int i = 0; i < high.length - 1; i++) {
         if (high[i] - high[i+1] > 5 || high[i] - high[i+1] < -5) {
            return false;
         }
      }        
      return true;
   }        
}