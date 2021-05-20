import java.util.Scanner;
import java.util.Random;

public class RandomTest {
   public static void main(String [] args) {
      Scanner in = new Scanner(System.in);
      Random r = new Random();
      
      System.out.println("Start value?");
      int start = in.nextInt();
      System.out.println("End value?");
      int end = in.nextInt();
      
      int num = start + r.nextInt(end);
      
      //System.out.println(num);
      System.out.printf("Random number between %d and %d is: %d", start, end, num);

   }
}