public class DieTester {

   public static void main (String [] args) {
   
      Die a = new Die();
      Die b = new Die();
      a.setNumFaces(7);
      
      if (a.equals(b))
         System.out.println("1. They're equal");
      
      b.setNumFaces(7);
      
      if (a.equals(b))
         System.out.println("2. They're equal");
         
      System.out.println(a);
   }
}