// Name : Joel Sare
// Class : CIST1400-015
// Colleagues : none
// References : none
// BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.
public class Lab02Corrections
{
   public static void main(String[] args)
   {
      /* PART 1
      Use a System.out.print() or System.out.println() statement to output
      something along the lines of "Hello World".  Make sure the code compiles 
      and runs correctly when you're done adding the code.
      */
      // YOUR CODE GOES HERE AFTER UNCOMMENTING THIS LINE
      
      System.out.println("Hello World");
            
      /* PART 2
      For this problem, first uncomment the line and try to compile the program 
      and see what happens.  When you have read through the results that come back from
      the compiler, fix the code below to enable the program to
      successfully compile.  Make the minimum amount of changes necessary.
      */

      System.out.println ( "This program initially won't compile!" );
      
      /* PART 3
      Use a System.out.print statement to output your favorite number.
      */
      // YOUR CODE GOES HERE AFTER UNCOMMENTING THIS LINE
      
      System.out.println("15");
      
      
      /* PART 4
      This program should use a System.out.print statement to print the
      current year.

      First, uncomment the line and compile and run this section.  
      Notice that the compiler doesn't produce any warnings or error messages, 
      but that running the program generates an error message.  
      Read the message carefully and then figure out what you need to do to 
      fix the problem so that the actual year prints.
      */

      int year = 2018;
      System.out.println ( "Here's a thing: " + year );

      /* PART 5
      Now decare another variable to store the current day of the month.
      Then use both variable to output today's date to the screen in three different formats.  
      Print the date in the following three formats:
      month / day / year
      Month (as a string) day, year
      day - month - year
      So, if today was the first of January, 2112, you would output the text 
      1/1/2112
      January 1, 2112 
      1 - 1 - 2112  
      */
      // YOUR CODE GOES HERE 
      
      int day = 31;
      System.out.println("8/" + day + "/2018");
      System.out.println("August " + day + ", 2018");
      System.out.println("8 - " + day + " - 2018");
      
      /* PART 6
      The last thing you have to do is to declare a constant. It can be any
      data type you wish. Then you need to give it a value.
      Lastly you should print the constant you declared along with a description
      of what it represents.
      */
      // YOUR CODE GOES HERE 
      
      final double PI = 3.14;
      System.out.println("The first three numbers of PI is: " + PI);
      
   }
}
