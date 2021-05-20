// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

// The purpose of this program is to determine amount of paint needed
public class Paint
{
   public static void main(String[] args)
   {
      // declare variables

      // ***** one gallon of paint covers 350 square feet and this value DOES NOT CHANGE
      final int oneGal = 350;

      // ***** declare integers length, width, and height;
      int length;
      int width;
      int height;

      // ***** declare double totalSqFt;
      double totalSqFt;

      // ***** declare double paintNeeded;
      double paintNeeded;

      // ***** fill in values for the room's dimensions
      length = 25;
      width = 15;
      height = 8;

      // ***** Compute the total square feet to be painted--think
      //about the dimensions of each wall
      totalSqFt = ((2 * length) + (2 * width)) * height;

      // ***** Compute the amount of paint needed
      paintNeeded = totalSqFt / oneGal;

      // ***** Print the length, width, and height of the room and the
      //number of gallons of paint needed.
      //     A room that is 25 feet long and 15 feet wide and 8 feet high has YYY square feet and requires XX.XXX gallons of paint.
      System.out.printf("A room that is %d feet long and %d wide and %d high has %.0f square feet and requires %.5f gallons of paint.\n", length, width, height, totalSqFt, paintNeeded);
   }
}