// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

public class Weather {
   private Temperature temp;
   private int humidity;
   private int windspeed;
   private String windDirection;
   
   public Weather() {
      temp = new Temperature();
      humidity = 50;
      windspeed = 0;
      windDirection = "W";
   }
   
   public Weather(double tmp, char scl) {
      temp = new Temperature(tmp, scl);
      humidity = 50;
      windspeed = 0;
      windDirection = "W";
   }
   
   public Temperature getTemp() {
      return temp;
   }
   
   public int getHumidity() {
      return humidity;
   }
   
   public int getWindSp() {
      return windspeed;
   }
   
   public String getWindDir() {
      return windDirection;
   }
   
   public void setTemperature(Temperature newTemp) {
      this.temp = newTemp;
   }
   
   public void setHumidity(int humid) {
      if (humid >= 0 && humid <= 100)
         humidity = humid;
   }
   
   public void setWindSp(int speed) {
      if (speed >= 0)
         windspeed = speed;
   }
   
   public void setWindDir(String dir) {
      switch (dir) {
         case "E": case "N": case "W": case "S":
         case "NW": case "SW": case "SE": case "NE":
            windDirection = dir;
      }
   }
   
   public String toString() {
      return String.format("The weather is currently %s with %d humidity and a %d mph wind "
                            + "from the %s\n", temp, humidity, windspeed, windDirection);
   }
   
   public boolean equals(Weather other) {
      boolean result = false;
      if (other instanceof Weather) {
         Weather o = (Weather) other;
         if (this.getTemp().equals(o.getTemp()) && this.getHumidity() == o.getHumidity()) {
            result = true;
         }
      }
      return result;
   }
}