public class Pythagorean_Triples {
   
   public static void main (String[] args) {
   
      final int MAX = 5;

      for (int a = 1; a <= MAX; a++) {
         for (int b = 1; b <= MAX; b ++) {
            for (int c = 1; c <= MAX; c++) {
               if (a*a + b*b == c*c) {
                  System.out.printf("%d^2 + %d^2 = %d^2\n",a,b,c);
               }
            }
         }
      }

   }
}