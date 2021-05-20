import java.util.Scanner;
public class SubtractingForLoopGame {

   public static void main (String[] args) {
      
      Scanner in = new Scanner( System.in );
   
      System.out.println("> or >=");
      String val = in.nextLine();      
      System.out.println("Enter an initial value");
      int start = in.nextInt();
      System.out.println("End value?");
      int end = in.nextInt();
      System.out.println("Decrease value by how much?");
      int inc = in.nextInt();
   
      int counter = 0;
      int ans;
      
      switch (val) {
         case ">":
            System.out.println("How many times will this loop iterate?");
            System.out.printf("for (int x = %d; x %s %d; x = x - %d) {\n\tcounter++ \n}\n", start, val, end, inc);
            for (int x = start; x > end; x = x - inc) {
               counter++;
            }
            ans = in.nextInt();
            if (ans == counter)
               System.out.println("Correct");
            else
               System.out.println("Wrong, it's actually: " + counter);
            break;

         case ">=":
            System.out.println("How many times will this loop iterate?");
            System.out.printf("for (int x = %d; x %s %d; x = x - %d) {\n\tcounter++ \n}\n", start, val, end, inc);
            for (int x = start; x >= end; x = x - inc) {
               counter++;
            }
            ans = in.nextInt();
            if (ans == counter)
               System.out.println("Correct");
            else
               System.out.println("Wrong, it's actually: " + counter);
            break;
      }
   }
}