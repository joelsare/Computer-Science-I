// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

import java.util.Scanner;
public class FizzBuzz {
   public static void main (String[] args) {
      Scanner in = new Scanner( System.in );
      System.out.println("FizzBuzz");
      System.out.print("Enter a non-negative number: ");
      int val = in.nextInt();
      
      if (val > 0) {
      System.out.println();
         for (int i = 1; i <= val; i++) {//beginning of for loop
            if ((i % 3 == 0) && (i % 5 == 0)) {//beginning of divisible by both
               System.out.println("FizzBuzz");
            }//end of divisible by both
            else if (i % 3 == 0) {//beginning of divisible by 3
               System.out.println("Fizz");
            }//end of divisible by 3
            else if (i % 5 == 0) {//beginning of divisible by 5
               System.out.println("Buzz");
            }//end of divisible by 5
            else {//end of neither
               System.out.println(i);
            }//end of neither
         }//end of for loop
      }
      else {
      System.out.println();
      }
      
   }
}