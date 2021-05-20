import java.util.Scanner;
public class UseSearchDemo {
   public static void main(String[] args) {
      Scanner get = new Scanner(System.in);
      int[] values = { 10, 20, 15, 30, 388, 2, -1, -2, 131 };
      int svalue, linPos, binPos;
      System.out.print("What value shall I find? ");
      svalue = get.nextInt();
      linPos = Search.linear(values,svalue);
      if ( linPos != -1 ) {
         System.out.println("Linear found at position: " + linPos);
      }
      binPos = Search.binary(values,svalue);
      if(binPos!=-1){
         System.out.println("Binary found at position: " + binPos);
      }
      if(binPos == -1 || linPos == -1){
         System.out.println("Value " + svalue + " not found!");
      }
   }
}