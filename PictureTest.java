public class PictureTest {

   public static void main (String[] args) {
      String col;
      
      Picture p = new Picture();
      System.out.println("Size: " + p.getSize() + "  " + p.colorToString() + " Format: " + p.getFormat());
      
      Picture s = new Picture(90, "JPEG", false);
      System.out.println("Size: " + s.getSize() + "  " + s.colorToString() + " Format: " + s.getFormat());
      
      Picture y = new Picture(-1, "tifF", true);
      System.out.println("Size: " + y.getSize() + "  " + y.colorToString() + " Format: " + y.getFormat());
      
      Picture z = new Picture(5, "fhewo", true);
      System.out.println("Size: " + z.getSize() + "  " + z.colorToString() + " Format: " + z.getFormat());
      
      System.out.println("s is " + s);
      System.out.println("y is " + y);
      System.out.println("z is " + z);
      
      s.setColor(false);
      s.setSize(10);
      System.out.println("s is " + s);
      
      s.setSize(-11);
      System.out.println("s is " + s);
      
      s.setSize(500);
      System.out.println("s is " + s);
      
      s.setFormat("Bmp");
      System.out.println("s is " + s);
      
      s.setFormat("pNg");
      System.out.println("s is " + s);
      
      s.setFormat("giF");
      System.out.println("s is " + s);
      
      s.setFormat("hey");
      System.out.println("s is " + s);
   }
}