// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

import java.util.Scanner;
public class SimpleInput
{
   public static void main(String [] args)
   {
   Scanner in = new Scanner (System.in);
   
   System.out.println("What is your first name?");
   String firstName = in.nextLine();
   System.out.println("Hello, " +firstName);
   System.out.println();
   
   System.out.println("What year were you born?");
   int birthYear = in.nextInt();
   System.out.println(birthYear);
   int age = 2018-birthYear;
   System.out.println(age);
   
   final double life = 76.9;
   System.out.println((age / life) * 100);
   System.out.println();
   
   System.out.println("What do you think the value of PI is?");
   double PIguess = in.nextDouble();
   System.out.println(PIguess);
   final double PI = 22.0/7.0;
   System.out.println(PI-PIguess);
   }
}