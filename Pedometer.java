// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.     

public class Pedometer {
   
   private int steps;
   private double strideLength;
   final int FEETPERMILE = 5280;
   final double FEETPERKM = 3280.84;
   
   public Pedometer() {
   
   }
   public Pedometer(int s) {
      setSteps(s);
   }
   public void setSteps(int s) {
      if (s >= 0)
         steps = s;
   }
   public int caloriesBurned(int weight) {
      int cb = 0;
      if (weight <= 150) {
         cb = 75 * steps;
      }
      else if (weight > 150 && weight < 200) {
         cb = 95 * steps;
      }
      else if (weight >= 200 && weight < 250) {
         cb = 118 * steps;
      }
      else if (weight >= 250 && weight < 300) {
         cb = 135 * steps;
      }
      else if (weight >= 300 && weight < 350) {
         cb = 150 * steps;
      }
      else if (weight >= 350) {
         cb = 175 * steps;
      }
      return cb;
   }
   public double miles() {
      return (steps * strideLength) / FEETPERMILE;
   }
   public double kilometers() {
      return (steps * strideLength) / FEETPERKM;
   }
   public int getSteps() {
      return steps;
   }
   public void reset() {
      steps = 0;
   }
   public double getStrideLength() {
      return strideLength;
   }
   public void setStrideLength(double sl) {
      if (sl > 0)
         strideLength = sl;
   }
   public void step() {
      steps++;
   }
   public void addSteps(int s) {
      if (s > 0)
         steps += s;
   }
}