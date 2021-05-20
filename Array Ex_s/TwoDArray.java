public class TwoDArray {
   
   public static void main (String[] args) {
   
      
      int [][] w = {{1,2,3,6,0}, {3,5,2,4,6,8}};
      
      for (int r = 0; r < w.length; r++) {
         for (int c = 0; c < w[r].length; c++) {
            System.out.printf("%5d", w[r][c]);
         }
         System.out.println();
      }
   }
}