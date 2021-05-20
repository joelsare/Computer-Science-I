// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

public class Temperature {
   private double degrees;
   private char scale;
   
   public Temperature() {
      degrees = 0;
      scale = 'C';
   }

   public Temperature(double tempr, char scl) { 
      if (scl == 'F' || scl == 'f') {
         if (tempr >= -50 && tempr <= 150) {
            degrees = tempr;
            setScl(scl);
         }
         else {
            degrees = 0;
            scale = 'C';
         }
      }
      else if( scl == 'C' || scl == 'c') {
         if (tempr >= -45.556 && tempr <= 65.5556) {
            degrees = tempr;
            setScl(scl);
         }
         else {
            degrees = 0;
            scale = 'C';
         }
      }
      else {
         degrees = 0;
         scale = 'C';
      }
   }
   
   public void setScl(char scl) {
      switch (scl) {
         case 'c': case 'C':
            scale = 'C';
            break;
         case 'f': case 'F':
            scale = 'F';
            break;
         default:
            scale = 'C';
      }
   }
   public double getTemp() {
      return degrees;
   }
   
   public char getScale() {
      return scale;
   }
   
   public void set(double temp, char scl) {
      setTemp(temp);
      setScale(scl);
   }
   
   public void setTemp(double tempr) {
      if (getScale() == 'F' || getScale() == 'f') {
         if (tempr >= -50 && tempr <= 150) {
            degrees = tempr;
         }
         else {
            degrees = 0;
            scale = 'C';
         }
      }
      else if( getScale() == 'C' || getScale() == 'c') {
         if (tempr >= -45.556 && tempr <= 65.5556) {
            degrees = tempr;
         }
         else {
            degrees = 0;
            scale = 'C';
         }
      }
      else {
         degrees = 0;
         scale = 'C';
      }
   }
   
   public void setScale(char scl) {
      switch (scl) {
         case 'c': case 'C':
            scale = 'C';
            degrees = convertFtoC(degrees);
            break;
         case 'f': case 'F':
            scale = 'F';
            degrees = convertCtoF(degrees);
            break;
      }
   }
   
   @Override
   public String toString() {
      return degrees + " degrees " + scale;
   }
   
   public boolean equals(Temperature other) {
      boolean result = false;
      if (other instanceof Temperature) {
         Temperature o = (Temperature) other;
         if (this.getScale() == 'C' && o.getScale() == 'C') {
            if (Math.abs((this.getTemp() - o.getTemp())) < 0.001) {
               result = true;
            }
         }
         else if (this.getScale() == 'F' && o.getScale() == 'F') {
            if (Math.abs((this.getTemp() - o.getTemp())) < 0.001) {
               result = true;
            }
         }
         else if (this.getScale() == 'F' && o.getScale() == 'C') {
            double thisTemp = this.getTemp();
            thisTemp = convertFtoC(thisTemp);
            if (Math.abs((thisTemp - o.getTemp())) < 0.001) {
               result = true;
            }
         }
         else if (this.getScale() == 'C' && o.getScale() == 'F') {
            double thisTemp = this.getTemp();
            thisTemp = convertCtoF(thisTemp);
            if (Math.abs((thisTemp - o.getTemp())) < 0.001) {
               result = true;
            }
         }
      }
      return result;
   }
   
   private double convertFtoC(double temp) {
      return ((temp - 32) * (5.0/9.0));
   }
   
   private double convertCtoF(double temp) {
      return ((temp * 9.0/5.0) + 32);
   }
}