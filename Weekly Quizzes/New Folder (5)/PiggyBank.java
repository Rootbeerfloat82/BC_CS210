/* Ethan Leonard, CS 210, 08/08/2023,Programming Assignment:PIggyBank class, In this program, 
I have created an object known as PiggyBank that stores many features inside this class file */

public class PiggyBank {
   
   //fields
   private int quarters;
   private int dimes;
   private int nickels;
   private int pennies;
   
   //constructor
   public PiggyBank(int quarters, int dimes, int nickels, int pennies) {
      check(quarters);
      check(dimes);
      check(nickels);
      check(pennies);
      this.quarters = quarters;
      this.dimes = dimes;
      this.nickels = nickels;
      this.pennies = pennies;
   }
   
   // default constructor
   public PiggyBank() {
      this(0,0,0,0);
   }
   
   // accessor
   public int getQuarters() {
      return this.quarters;
   }
   
   // accessor
   public int getDimes() {
      return this.dimes;
   }
   
   // accessor
   public int getNickels() {
      return this.nickels;
   }
   
   // accessor
   public int getPennies() {
      return this.pennies;
   }
   
   // accessor 
   public double getValue() {
      double value = 0.00;
      value += round(this.quarters * 0.25);
      value += round(this.dimes * 0.10);
      value += round(this.nickels * 0.05);
      value += round(this.pennies * 0.01);
      return value;
   }
   
   // mutator
   public void setQuarters(int n) {
      check(n);
      this.quarters = n;
   }
   
   // mutator
   public void setDimes(int n) {
      check(n);
      this.dimes = n;
   }
   
   // mutator
   public void setNickels(int n) {
      check(n);
      this.nickels = n;
   }
   
   // mutator
   public void setPennies(int n) {
      check(n);
      this.pennies = n;
   }
   
   
   // mutator that transfer from one to another
   public void transferTo(PiggyBank p) {
      p.setQuarters(this.quarters + p.quarters);
      p.setNickels(this.nickels + p.nickels);
      p.setDimes(this.dimes + p.dimes);
      p.setPennies(this.pennies + p.pennies);
      
      this.quarters = 0;
      this.dimes = 0;
      this.nickels = 0;
      this.pennies = 0;
   }
   
   // method function for checking if value negative
   public void check(int n) {
      if (n < 0) {
         throw new IllegalArgumentException("Please Provide Positive Value");
      }
   }
   
   // method function for rounding answers
   public double round(double n) {
      double g = (double)Math.round(n * 100) / 100;
      return g;
   }
   
   // toString method for making readable
   public String toString() {
      String s = "PiggyBank($" + this.getValue() + ")";
      return s;
   }
}