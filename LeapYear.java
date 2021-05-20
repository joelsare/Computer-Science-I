import java.util.Scanner;

public class LeapYear {
   public static void main (String [] args){
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter year.");
      int year = in.nextInt();
    
      if (year % 4 == 0) {
         if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
         }
         if (year % 100 != 0) {
            System.out.println(year + " is a leap year.");
         }
      }
      else
         System.out.println(year + " is not a leap year.");
   }
}