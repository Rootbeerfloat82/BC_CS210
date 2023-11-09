// CS210 Bellevue College
// Chapter 9 Tanuja Joshi
// Client code for Worker and SpecialWorker classes
public class WorkerClient {
   public static void main(String[] args) {
      System.out.println("****Worker: first****");
      Worker first = new Worker();
      System.out.println(first); // Name: unknown, hourly pay=$0.00
      try {
         first.setHourlyPay(99); // should throw IllegalArgument Exception
         System.out.println("Hourly pay 99 allowed.");
      }
      catch (Exception e) {
         System.out.println("Hourly pay 99 rejected.");
      }

      System.out.println("\n");
      System.out.println("****Worker: Sally****");
      SpecialWorker sally = new SpecialWorker(8);
      sally.setName("Sally");
      System.out.println(sally); // Special Name: Sally, hourly pay=$0.00
      try {
         sally.setHourlyPay(15.25); // should throw IllegalArgument Exception
         System.out.println("Hourly pay 15.25 allowed.");
      }
      catch (Exception e) {
         System.out.println("Hourly pay 15.25 rejected.");
      }  
      System.out.println(sally); // Special Name: Sally, hourly pay=$0.00
      try {
         sally.setHourlyPay(15.62); 
         System.out.println("Hourly pay 15.62 allowed.");
      }
      catch (Exception e) {
         System.out.println("Hourly pay 15.62 rejected.");
      }  
      System.out.println(sally); // Special Name: Sally, hourly pay=$15.62      

      System.out.println("\n");
      System.out.println("****Worker: Jack****");

      SpecialWorker jack = new SpecialWorker("Jack", 9);
      try {
         jack.setHourlyPay(25.45);
         System.out.println("Hourly pay 25.45 allowed.");
      }
      catch (Exception e) {
         System.out.println("Hourly pay 25.45 rejected.");
      }
      System.out.println(jack); // Special Name: Jack, hourly pay=$25.44
      
      jack.volunteer();
      System.out.println(jack); // Special Name: Jack, hourly pay=$0.00
   }
}