public class NestedLoopTest {

   public static void main (String[] args) {
      
      int i = 1, j = 1;
      int n = 8;
      
      for (i = 1; i <= n; i++) {
         for (j = 1; j <= i; j++) {
            System.out.print('*');
         }
         System.out.println();
      }
      char o = 'a';
      o++;
   }
}