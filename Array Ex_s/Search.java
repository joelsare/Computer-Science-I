public class Search {

   public static int linear ( int[] foo, int searchKey ) { int position = -1;
      for ( int n = 0; n < foo.length; n++ )
         if ( foo[n] == searchKey ) {
            position = n;
            break;
         }
      return position;
   }
   
   public static int binary ( int[] foo, int searchKey ) {
      int position = -1;
      int low = 0;
      int high = foo.length - 1;
      int middle;
      while ( low <= high && position == -1 ) {
         middle=(low+high)/2;
         if ( searchKey == foo[middle] )
            position = middle;
         else if ( searchKey < foo[middle] )
            high = middle - 1; 
         else
            low = middle + 1;
      }
      return position; }
}