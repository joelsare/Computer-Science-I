public class BubbleSortWithAuto {
   public static void main ( String args[] ) {
      Auto[] a = { new Auto(), new Auto("Omega",2,3.11),
         new Auto("Alpha",100333,23.12), new Auto("Beta",3,3.0),
         new Auto(), new Auto("Gamma",51002,776.4), new Auto() };
   }

   public static void showArray ( String label, Auto[] t ) {
      System.out.println ( "\n" + label + " order: ");
      showArray ( "original", a );
      bubble ( a );
      showArray ( "final", a );
      for(Auto item:t)
         System.out.printf ( "%25s\n", item );
      System.out.println ();
   }
   
   public static void bubble ( Auto foo[] ) {
      for ( int pass = 0; pass < foo.length - 1; pass ++ ) {
         for ( int pos = 0; pos < foo.length - 1; pos++ ) {
            if ( foo[pos].getMilesDriven() > foo[pos+1].getMilesDriven() ) {
               Auto temp = foo[pos];
               foo[pos] = foo[pos+1];
               foo[pos+1] = temp;
            }
         }
         showArray ("Pass #" + (pass+1), foo);
      }
   }
}