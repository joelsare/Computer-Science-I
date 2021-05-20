/* File Array2DMethods.java
   Fills 10 x 100 array with random numbers between 100 and 999 inclusive and finds average, 
   largest, smallest, and reverses array
*/
import java.util.*;

public class Array2DMethods
{
  /**
   * main method invoked when program starts
   * @param args an array of Strings containing possible parameters to main program
   */
   public static void main (String [] args)
   {
   
      int min;
      /** stores position of minimum value found in array */
      int max;
      /** stores position of maximum value found in array */
      double avg;
      /** stores average of values in array */
      
   /* 
      The code below can be used to test your min(), max(), and average() methods.  
      Use this section of code and it will use the pre-filled testArr[] 
      array. The largest value should be 20, the smallest value should be 1, 
      and the average should be 7.800. 
      When finished, comment out this section of code.      
   */
   
   
      int [][] testArr = {{1, 2, 5, 6, 11}, {2, 4, 8, 20, 17}, {3, 6, 9, 20, 4}, {15, 2, 6, 4, 11}};
      printArray(testArr);
      System.out.println("Testing small and large on sample array");
      min = smallest(testArr);
      max = largest(testArr);
      avg = average(testArr);
      
      System.out.printf("Smallest in Test is %d.%n", min);
      System.out.printf("Largest in Test is %d.%n", max);
      System.out.printf("The average in Test array is %.3f%n", avg);
      System.out.println();
      
      
   /*
      The code below will create a 10 x 100 element array and then call all four 
      of the methods on that array.
   */

      final int ROWS = 10;
      final int COLS = 100;
      int [][] array = new int[ROWS][COLS];
      
      System.out.println("This program is now filling the array.");
      array = fillArray(ROWS, COLS);
      System.out.println("Array is:  ");
      printArray(array);
      
      System.out.println();
      
      System.out.println("Testing small and large on real array");
      min = smallest(array);
      max = largest(array);
      avg = average(array);
      System.out.printf("Smallest in array is %d.%n", min);
      System.out.printf("Largest in array is %d.%n", max);
      System.out.printf("The average in array is %.3f%n", avg);
      
      System.out.println();
   }
   
   /** printArray
    * prints a 2D array
    * @param arr array of integer values
    */
   public static void printArray(int [][] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = 0; j < arr[0].length; j++)
            System.out.print(arr[i][j] + "  ");
         System.out.println();
      }      
   } 
    
   /** fillArray
    * fills the array with random whole numbers between 100 and 999
    * @param rows number of rows in the array to be allocated and filled with values 
    * @param cols number of columns in the array to be allocated and filled with values
    * @return    array of integers that will be filled with values
    */
   public static int [][] fillArray ( int rows, int cols) {
      Random gen = new Random();
      int [][] arr = new int [rows][cols];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[r].length; c++) {
            arr[r][c] = gen.nextInt(900) + 100;
         }
      }
      return arr;
   }
    
    /** average
     * calculates the average value of the array
     * @param arr array of integer values
     * @return    the average of all the values in arr
     */
   public static double average ( int [][] arr) { 
      double sum = 0.0;
      double average = 0.0;
      int count = 0;
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[r].length; c++) {
            sum += arr[r][c];
            count++;
         }
      }
      if (count > 0) {
         average = sum / count;
      }
      return average;
   }
    
    
    
    
    /** smallest
     * smallest will return the smallest value
     * @param arr the array of integers that contain values to process
     * @return    an int that is the smallest value in the array   
     */
   public static int smallest (int [][] arr) {
      int smallest = arr[0][0];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[r].length; c++) {
            if (arr[r][c] < smallest) {
               smallest = arr[r][c];
            }
         }
      }
      return smallest;
   }
       
    /** largest
     * largest will return the largest value
     * @param arr the array of integers that contain values to process
     * @return    an int that is the largest value in the array   
     */
   public static int largest (int [][] arr) {
      int largest = arr[0][0];
      for (int r = 0; r < arr.length; r++) {
         for (int c = 0; c < arr[r].length; c++) {
            if (arr[r][c] > largest) {
               largest = arr[r][c];
            }
         }
      }
      return largest;
   }
}