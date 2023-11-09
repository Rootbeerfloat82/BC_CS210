import java.io.*;
import java.util.*;

public class File_Read {

   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("input.txt"));
      System.out.println(input.next());
      System.out.println(input.next());
      System.out.println(input.nextLine());
      System.out.println(input.next());
   }
}