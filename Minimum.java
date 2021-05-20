//  CIST 1400 Fall 2018
//  Lab Practical #1
//  Starter Code
//  Name:  Joel Sare

//  You should copy this code and rename the class for the specific problem.

import java.util.Scanner;

public class Minimum {

   public static void main (String [] args) {
   
      Scanner get = new Scanner(System.in);
      int min, val;
      
      System.out.println("Enter a value, 1 to quit: ");
      val = get.nextInt();
      min = val;
      
      while (val != 1) {
         if (val < min) 
            min = val;
         System.out.println("Enter a value, 1 to quit: ");
         val = get.nextInt();
      }
      System.out.println(min);
      
      
   }
}