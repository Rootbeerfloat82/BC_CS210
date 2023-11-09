public class Parameter_Mystery {
   public static void main(String[] args) {
      int x = 0, y = 1, z = 2;
      
      x = mystery(y, x, z);
      System.out.println(x + " " + y + " " + z);
      
   }
   
   public static int mystery(int z, int x, int y) {
      x++;
      y = 2 * z + x;
      z = x + y + z;
      System.out.println(y + " " + z);
      return x;
   }
}