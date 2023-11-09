
public class Hello {
   public static void main(String[] args) {
      MyClass one = new MyClass(150);
      MyClass two = new MyClass(one.getCount());
      
      MyClass three = one;
      
      one.addToCount(25);
      
      System.out.println(one.getCount());
      System.out.println(two.getCount());
      System.out.println(three.getCount());
   
   }
}