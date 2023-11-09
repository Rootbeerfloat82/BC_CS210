public class FurnitureClient{
   public static void main(String[] args) {
    
      double[] tableWtData = {100, 75.5, -30, 50,100};
      String[] tableWoodData= {"Pine", "Oak", "Cherry", "Teak", "Pine"};
      double[] bedWtData = {203.70, 100,100,95,100 };
      String[] bedSizeData = {"King", "Twin","Twin", "Schwin", "Queen"};
   
      Furniture[] furnitureGallery = new Furniture[tableWtData.length + bedWtData.length];
      System.out.println("Adding TableData...");
      int index = 0;
      for (int k= 0; k < tableWtData.length; k++) {
         try{
            System.out.print("Adding..." + k+ "  ");
            Table t = new Table(tableWtData[k],tableWoodData[k]);
            furnitureGallery[index] = t;
            index++;
            System.out.println("....Success");
         }
         catch (Exception e) {
            System.out.println(".....Failure: " + e);
         }
      }
      System.out.println("Adding BedData...");
      for (int k= 0; k < bedWtData.length; k++) {
         try{
            System.out.print("Adding..." + k+ "  ");
            Bed b = new Bed(bedWtData[k],bedSizeData[k]);
            furnitureGallery[index] = b;
            index++;            
            System.out.println("....Success");
         }
         catch (Exception e) {
            System.out.println(".....Failure: " + e);
         }
      }
      System.out.println("----------------------------------------------");   
      
      System.out.println("Printing inventory:");
      for (int i = 0; i < furnitureGallery.length;i++) {
         System.out.println(i + " " +furnitureGallery[i]);
      }
   
      System.out.println("----------------------------------------------");   
      System.out.println("Calling methods :");
      
   
      Table table1 = (Table) furnitureGallery[1];
      table1.setWeight(80.5);
      System.out.println("table1.getWeight(): "  + table1.getWeight());
            
      try {
         table1.setWood("Teak");
         System.out.println("Teak wood accepted.");
      }
      catch (Exception e) {
         System.out.println("Teak wood rejected.");
      }
      System.out.println("table1.getWood(): "  + table1.getWood());
   
      Bed bed1 = (Bed) furnitureGallery[3];
      try {
         bed1.setWeight(-200);
         
         System.out.println("Negative weight accepted.");
      }
      catch (Exception e) {
         System.out.println("Negative weight rejected.");
      }   
      System.out.println("bed1.getWeight(): "  + bed1.getWeight());
   } 
}