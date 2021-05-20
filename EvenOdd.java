//  CIST 1400 Fall 2018
//  Lab Practical #1
//  Starter Code
//  Name:  

//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class EvenOdd {

   public static void main (String [] args) {
      
      int val;
      Scanner get = new Scanner(System.in);
      
      System.out.print("Enter a value between 18 and 65: ");
      val = get.nextInt();
      
      while (val >= 18 && val <= 65) {
         if (val % 2 == 0)
            System.out.println("Even");
         else
            System.out.println("Odd");
         System.out.print("Enter a value between 18 and 65: ");
         val = get.nextInt();
      }
      
      
      
   }
}