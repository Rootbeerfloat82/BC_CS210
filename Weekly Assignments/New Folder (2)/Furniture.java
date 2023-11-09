/* Ethan Leonard, CS 210, 08/14/2023,Programming Assignment:Furniture class, In this program, 
I have designed a couple classes to preform varius furniture functions */

public class Furniture {
   // private fields 
   private double weight;
   private int inventoryId;
   
   // static constant
   public static final int initialInventoryId = 111111;
   
   // static field
   public static int lastInventoryId = initialInventoryId;
   
   // constructor method
   public Furniture(double weight) {
      check(weight);
      
      this.weight = weight;
      
      this.inventoryId = lastInventoryId++;
   }
   
   // accessor 
   public double getWeight() {
      return this.weight;
   }
   
   // mutator
   public void setWeight(double weight) {
      check(weight);
      
      this.weight = weight;
   }
   
   // toString method
   public String toString() {
      return "Item number: " + this.inventoryId + " Weight: " + this.weight + " lbs";
   }
   
   // helper function check
   public void check(double weight) {
      if (weight < 0) {
         throw new IllegalArgumentException("Weight must be positive");
      }
   }
}