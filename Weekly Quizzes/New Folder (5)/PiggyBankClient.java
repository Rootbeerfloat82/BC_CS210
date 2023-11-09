public class PiggyBankClient {
   public static void main(String[] args) {
      PiggyBank pb0 = new PiggyBank();
      PiggyBank pb1 = new PiggyBank(92,4,17,81);
      PiggyBank pb2 = new PiggyBank(1,2,3,4);
      PiggyBank pb3 = new PiggyBank(2011,474,183,3281);
      System.out.println(pb0); // PiggyBank($0.0)
      System.out.println(pb1);  // PiggyBank($25.06)
      System.out.println(pb2.getPennies()); // 4
      double value = pb3.getValue();
      System.out.println(value); //592.11
      
      pb0.setQuarters(400);     
      pb0.setDimes(13);        
      pb0.transferTo(pb2);  // PiggyBank pb0 should be emptied after the transfer
      System.out.println(pb0.getQuarters()); // 0
      System.out.println(pb2.getQuarters()); // 401
      System.out.println(pb0);  // PiggyBank($0.0)
      System.out.println(pb2); // PiggyBank($101.94)
      try {
         pb1.setDimes(-13); // illegal
      } catch (IllegalArgumentException event) {
         System.out.println(event);                  
      }
      try {
         PiggyBank another = new PiggyBank(-1,-1,-1,-1); // illegal
      } 
      catch (IllegalArgumentException event) {
         System.out.println(event);
                   
      }
   
   }
}
