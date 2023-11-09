

public class test {
   
   public static void main(String[] args) {
      Ron ron = new Ron();
      
      Harry harry = new Harry();
      
      ron.a();
      
      System.out.println();
      
      ron.b();
      
      System.out.println();
      
      harry.a();
      
      System.out.println();
      
      harry.b();
      
      System.out.println();
   }
   
}

class Ron extends Harry {
   public void b() {
      a();
      System.out.print("Ron b ");
      
   }
   
}

class Harry {
   public void a() {
      System.out.print("Harry a ");
   }
   
   public void b() {
      System.out.print("Harry b ");
      
   }
   
}


