// CS210 Bellevue College
// Chapter 9 Tanuja Joshi
// A class to represent workers in general.
public class Worker {
   private String name;
   private double hourlyPay;
	
	// Constructor
   public Worker() {
      this("unknown");
   }

   public Worker(String name) {
      setName(name);
      setHourlyPay(0);
   }
    // Accessors
   public String getName() {
      return name;
   }
    
   public double getHourlyPay() {
      return hourlyPay;
   }
    

   public String toString() {
      return "Name: " + name + ", hourly pay=$" + hourlyPay;
   }
    
    // Mutators
   public void setName(String n) {
      name = n;
   }
    
   public void setHourlyPay(double rate) {
      if (!verifyPay(rate)) {
         throw new IllegalArgumentException("hourly pay constraint violation");
      }
      this.hourlyPay = rate;
   }
    
   public boolean verifyPay(double hourlyPay) {
    	// be certain either the hourlyPay is zero or the penny and dime digits are not both zero 
      if ( hourlyPay>0) {
         int dollars = (int)hourlyPay;
         int pennies = (int)Math.round((hourlyPay-dollars)*100.);
         if (pennies == 0) {
            return false;
         }      
      }
      return true;
   }
}
