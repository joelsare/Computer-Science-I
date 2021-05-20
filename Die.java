import java.util.Random;
public class Die {
   public static final int MIN_FACES = 4;
   private int numFaces;
   private int faceValue;
   
   public Die() {
      this.numFaces = 6;
      this.faceValue = 1;
   }
   
   public Die(int num) {
      if (num >= MIN_FACES) {
         numFaces = num;
      }
      else {
         numFaces = 6;
      }
      faceValue = 1;
   }
   
   public void setNumFaces(int num) {
      if (num > 0 && num >= MIN_FACES) {
         numFaces = num;
      }
   }
   
   public void setFaceValue(int num) {
      if (num > 0 && num <= numFaces) {
         faceValue = num;
      }
   }
   
   public int getNumFaces() {
      return numFaces;
   }
   
   public int getFaceValue() {
      return faceValue;
   }
   
   public int roll() {
      Random rand = new Random();
      faceValue = 1 + rand.nextInt(numFaces);
      return faceValue;
   }
   
   public boolean equals(Die other) {
      boolean result = false;
      if (other instanceof Die) {
         Die o = (Die) other;
         if (this.getNumFaces() == o.getNumFaces() && this.getFaceValue() == o.getFaceValue()) {
            result = true;
         }
      }
      return result;
   }
   
   public String toString() {
      return "Die has " + numFaces + " sides and current value is " + faceValue;  
   }
}