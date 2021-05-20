import java.util.Scanner;
import java.util.Random;

public class WhileLoopExamples {
   public static void main (String[] args) {
      int counter = 0;
      int x = 0;
      
      while (x < 88) {
         //System.out.println("We're counting. x = " + x);
         counter++;
         x++;
      }
      System.out.println("This loop executed " + counter + " times.");
      
      /*//what is the value of counter?
      System.out.printf("Counter value: %d", counter);
      Scanner i = new Scanner(System.in);
      Random r = new Random();
      
      int num = r.nextInt(100) + 1;
      int guess = -1;
      
      while (guess != num) {
         System.out.println("Guess a number from 1-100");
         guess = i.nextInt();
         if (guess < num) {
            System.out.println("Too small. Try again");
         }
         else if (guess > num) {
            System.out.println("Too big. Try again");
         }
         else {
            System.out.println("Correct");
         }
      }*/
   }
}