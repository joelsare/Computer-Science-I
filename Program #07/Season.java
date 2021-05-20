// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

public class Season {
   private String season;
   
   public Season() {
      season = "winter";
   }
   
   public String getSeason() {
      return season;
   }
   
   public void setSeason(String newseason) {
      newseason = newseason.toLowerCase();
      switch (newseason) {
         case "spring": case "summer": 
         case "winter": case "fall": case "autumn":
            season = newseason;
      }
   }
   
   public String toString() {
      return season;
   }
   
   public boolean equals(Season other) {
      boolean result = false;
      if (other instanceof Season) {
         Season o = (Season) other;
         if (this.getSeason().equals("fall") || this.getSeason().equals("autumn")) {
            if (o.getSeason().equals("fall") || o.getSeason().equals("autumn")) {
               result = true;     
            }
         }
         if (this.getSeason().equals(o.getSeason())) {
            result = true;
         }
      }
      return result;
   }
}