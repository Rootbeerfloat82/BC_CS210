/* Ethan Leonard, CS 210, 08/14/2023,Programming Assignment:Special Worker, In this program, 
I have designed a couple classes to preform varius worker functions */

public class SpecialWorker extends Worker {
   private int code;
   
   public SpecialWorker(int code) {
      super();
      this.code = code;
   }
   
   public SpecialWorker(String name, int code) {
      super(name);
      this.code = code;
   }
   
   public void volunteer() {
      super.setHourlyPay(0);
   }
   
   public String toString() {
      return "Special " + super.toString();
   }
   
   public boolean verifyPay(double hourlyPay) {
      int dollars = (int)hourlyPay;
      int dimes = Math.round((int)Math.round((hourlyPay-dollars)*100.)/10);
      double n = (hourlyPay-dollars) - (((double)dimes)/10.0);
      double r = n * 100.0;
      int k = (int)r;
      int z = k + 1;
      int pennies = z;
      
      if ((super.verifyPay(hourlyPay) && (dimes + pennies) == this.code) || hourlyPay == 0) {
         return true;
      } else {
         return false;
      }  
   }
   
   


}