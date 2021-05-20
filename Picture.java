public class Picture {

   private int size;
   private boolean color;
   private String format;
   
   public Picture() {
      size = 1;
      color = true;
      format = "none";
   }
   public Picture(int s, String f, boolean c) {
      setSize(s);
      color = c;
      setFormat(f);
   }
   
   public int getSize() {
      return size;
   }
   
   public String colorToString() {
      if (color)
         return "color";
      else
         return "BW";
   }
   
   public boolean getColor() {
      if (color)
         return true;
      else
         return false;
   }
   
   public String getFormat() {
      return format;
   }
   
   public void setSize(int s) {
      if (s >= 1)
         size = s;
      else
         size = 1;
   }
   
   public void setColor(boolean c) {
      color = c;
   }
   
   public void setFormat(String f) {
      f = f.toLowerCase();
      if (f.equals("bmp") || f.equals("jpeg") || f.equals("tiff") || f.equals("png") || f.equals("gif") ) {
         format = f; 
      }
      else {
         format = "none";
      }
   }
   
   public String toString() {
      if (getColor()) {
         return "Picture is color, " + size + " kb big, and in " + format + " format";
      }
      else {
         return "Picture is black and white, " + size + " kb big, and in " + format + " format";
      }
   }
}