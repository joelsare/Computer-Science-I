public class TemperatureTester {

   public static void main (String[] args) {
   
      Temperature a = new Temperature(150, 'f');
      Temperature b = new Temperature(65.5556, 'c');
      
      a.setTemp(155.6);
      
      System.out.println(a);
      System.out.println(b);
      
      
      if (a.equals(b))
         System.out.println("They're equal");
   }
}