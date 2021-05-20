public class BubbleSortWithIntAndReturn {
   public static void main ( String args[] ) {
      int[] a = { 15, 62, 51, 7, 16, 12 };
      showArray ( "Before A goes to bubble", a );
      int[] mySorted = bubble ( a );
      showArray ( "After A goes to bubble", a );
      showArray ( "My Sorted Results", mySorted );
   }

   public static void showArray ( String label, int[] t ) {
      System.out.println ( "\n" + label + " order: ");
      for ( int item: t )
         System.out.printf ( "%4d", item );
      System.out.println ();
   }
   
   public static int[] bubble ( int foo[] ) { 
      int[] result = new int[foo.length];
      for (int i = 0; i < foo.length; i++)
         result[i] = foo[i];
      for ( int pass = 0; pass < result.length - 1; pass ++ ) {
         for ( int pos = 0; pos < result.length - 1; pos++ ) {
            if ( result[pos] > result[pos+1] ) {
               int temp = result[pos]; 
               result[pos] = result[pos+1]; 
               result[pos+1] = temp;
            } 
         }
      }
      return result;
   }
}