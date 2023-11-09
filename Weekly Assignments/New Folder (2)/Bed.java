/* Ethan Leonard, CS 210, 08/14/2023,Programming Assignment:Furniture class, In this program, 
I have designed a couple classes to preform varius furniture functions */

public class Bed extends Furniture {
   // private field
   private String size;
   
   // constructor
   public Bed(double weight, String size) {
      super(weight);
      checkS(size);
      this.size = size;
   }
   
   // accessor 
   public String getSize() {
      return this.size;
   }
   
   // mutator
   public void setSize(String size) {
      checkS(size);
      this.size = size;
   }
   
   // toString method
   public String toString() {
      return "Bed " + super.toString() + " Size: " + this.size;
   }
   
   // helper function check Size
   public void checkS(String size) {
      if (!(size.equals("Twin") || size.equals("Full") || size.equals("Queen") || size.equals("King"))) {
         throw new IllegalArgumentException("Invalid size value: " + size);
      }
   }
}