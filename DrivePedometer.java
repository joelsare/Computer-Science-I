import java.util.Scanner;

public class DrivePedometer
{
   public static void main(String [] args)
   {
      Pedometer mine = new Pedometer();
      Pedometer yours = new Pedometer(500);
      
      mine.setStrideLength(3.5);
      yours.setStrideLength(2.5);
      
      for (int i = 0; i < 10000; i++)
         mine.step();
      
      yours.addSteps(5000);
      
      System.out.println("I have burned " + mine.caloriesBurned(150) + " calories.");
      System.out.println("You have burned " + yours.caloriesBurned(200) + " calories.");
      
      yours.reset();
      yours.setSteps(11290);
      
      System.out.println("I have walked " + mine.miles() + " miles.");
      System.out.println("You have walked " + yours.kilometers() + " kilometers.");
      
      Pedometer other = new Pedometer(-5);
      System.out.println(other.getSteps() + " steps and stride of " + other.getStrideLength() + " feet.");
      other.setStrideLength(0);
      System.out.println(other.getSteps() + " steps and stride of " + other.getStrideLength() + " feet.");
      other.setSteps(-500);
      System.out.println(other.getSteps() + " steps and stride of " + other.getStrideLength() + " feet.");
      other.setSteps(0);
      System.out.println(other.getSteps() + " steps and stride of " + other.getStrideLength() + " feet.");

    }
}