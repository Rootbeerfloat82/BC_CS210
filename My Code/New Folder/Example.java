public class Example {

   public static void main(String[] args) {
      System.out.println(digitsum(19));
   }

   public static int digitsum(int n) {
      
      String number = "" + n;
      
      int sum = 0;
      
      for (int i = 0; i < number.length(); i++) {
         
         int g = number.charAt(i) - '0';
         
         sum+=g;
         
      }
      
      return sum;
  }
}