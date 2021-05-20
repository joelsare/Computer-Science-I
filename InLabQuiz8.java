public class InLabQuiz8 {

   public static void main (String[] args) {
      
      int outer = 0;
      while (outer < 4) {
      int inner = 0;
         while (inner <= outer) {
         System.out.print(outer + " ");
         inner++;
         }
      outer++;
      }
      
      System.out.println();
      
      int a = 24;
      int b = 30;
      while (b != 0) {
         int r = a % b;
         a = b;
         b = r;
      }
      System.out.println(a);
      
      int value = 15;
      while (value < 28) {
         System.out.print(value + " ");
         value++;
      }
   }
}