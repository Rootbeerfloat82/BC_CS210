public class MysterySoda {
   public static void main(String[] args) {
      String say = "pop";
      String pop = "pepsi";
      carbonated(say, "say", pop);   
   }
   
   public static void carbonated(String coke, String soda, String pop) {
      System.out.println("say " + soda + " not " + pop + " or " + coke);
   }
}