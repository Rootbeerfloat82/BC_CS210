/* Ethan Leonard, CS 210, 08/14/2023,Programming Assignment:Furniture class, In this program, 
I have designed a couple classes to preform varius furniture functions */

public class Table extends Furniture {
   // private field
   private String wood;
   
   // constructor
   public Table(double weight, String wood) {
      super(weight);
      checkW(wood);
      this.wood = wood;
   }
   
   // accessor
   public String getWood() {
      return this.wood;
   }
   
   // mutator
   public void setWood(String wood) {
      checkW(wood);
      this.wood = wood;
   }
   
   // toString method
   public String toString() {
      return "Table " + super.toString() + " Made of: " + this.wood;
   }
   
   // helper method Check Weight
   public void checkW(String wood) {
      if (!(wood.equals("Pine") || wood.equals("Oak") || wood.equals("Cherry"))) {
         throw new IllegalArgumentException("Invalid wood value: " + wood);
      }
   } 
}
