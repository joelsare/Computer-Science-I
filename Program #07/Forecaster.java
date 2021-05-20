// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.  

import java.util.Scanner;
public class Forecaster {

   public static void main (String [] args) {
      Scanner get = new Scanner(System.in);
      
      System.out.println("Welcome to the Weather Forcaster");
      int ans = 0;
      char tempPref;
      String season;
      
      Temperature tmp = new Temperature();
      Season ssn = new Season();
      Weather wthr = new Weather();
      boolean setSeason = false;
      
      while (ans != 6) {
         System.out.println("1. Set temperature preference");
         System.out.println("2. Set season");
         System.out.println("3. Set weather");
         System.out.println("4. Get forecast");
         System.out.println("5. Print the weather");
         System.out.println("6. Quit");
         System.out.print("Enter choice: ");
         ans = get.nextInt();
         get.nextLine();
         switch (ans) {
            case 1:
               do {
                  System.out.print("Enter temperature preference (C/F): ");
                  tempPref = get.next().charAt(0);
               } while (tempPref != 'C' && tempPref != 'F');
               tmp.setScale(tempPref);
               break;
            case 2:
               do {
                  System.out.print("Enter season: ");
                  season = get.nextLine().toLowerCase();
               } while (!season.equals("autumn") && !season.equals("fall") && !season.equals("winter")
                              && !season.equals("spring") && !season.equals("summer") );
               ssn.setSeason(season);
               setSeason = true;
               break;
            case 3:
               System.out.print("Enter temperature: ");
               tmp.setTemp(get.nextInt());
               System.out.print("Enter humidity: ");
               wthr.setHumidity(get.nextInt());
               System.out.print("Enter windspeed: ");
               wthr.setWindSp(get.nextInt());
               System.out.print("Enter wind direction: ");
               get.nextLine();
               wthr.setWindDir(get.nextLine());
               break;
            case 4:
               if (setSeason == false) {
                  System.out.println("Error, you must set season first");
               }
               else if (ssn.getSeason().equals("winter")) {
                  if (tmp.getScale() == 'F') {
                     if (tmp.getTemp() < 10 && wthr.getWindSp() > 15) {
                        System.out.println("The forecast is frigid");
                     }
                     else if (tmp.getTemp() >= 10 && tmp.getTemp() <= 30 && wthr.getHumidity() >= 80) {
                        System.out.println("The forecast is snow");
                     }
                     else if (tmp.getTemp() >= 28 && tmp.getTemp() <= 33 && wthr.getHumidity() >= 60 && wthr.getHumidity() <= 80) {
                        System.out.println("The forecast is icy");
                     }
                     else if (tmp.getTemp() > 40) {
                        System.out.println("The forecast is warm");
                     }
                     else {
                        System.out.println("The forecast is cold");
                     }
                  }
                  else if (tmp.getScale() == 'C') {
                     if (tmp.getTemp() < -12.222 && wthr.getWindSp() > 15) {
                        System.out.println("The forecast is frigid");
                     }
                     else if (tmp.getTemp() >= -12.222 && tmp.getTemp() <= -1.111 && wthr.getHumidity() >= 80) {
                        System.out.println("The forecast is snow");
                     }
                     else if (tmp.getTemp() >= -2.222 && tmp.getTemp() <= .555 && wthr.getHumidity() >= 60 && wthr.getHumidity() <= 80) {
                        System.out.println("The forecast is icy");
                     }
                     else if (tmp.getTemp() > 4.444) {
                        System.out.println("The forecast is warm");
                     }
                     else {
                        System.out.println("The forecast is cold");
                     }
                  }
               }
               else if (ssn.getSeason().equals("summer")) {
                  if (tmp.getScale() == 'F') {
                     if (tmp.getTemp() >= 89.6 && wthr.getWindSp() < 50 && wthr.getHumidity() >= 70) {
                        System.out.println("The forecast is steamy");
                     }
                     else if (tmp.getTemp() >= 89.6 && wthr.getWindSp() >= 20 && wthr.getHumidity() >= 70) {
                        System.out.println("The forecast is stormy");
                     }
                     else if (tmp.getTemp() >= 86 && wthr.getHumidity() < 50) {
                        System.out.println("The forecast is dry heat");
                     }
                     else if (tmp.getTemp() < 89.6 && tmp.getTemp() >= 30 && wthr.getWindSp() >= 20) {
                        System.out.println("The forecast is hot and windy");
                     }
                     else if (tmp.getTemp() >= 86) {
                        System.out.println("The forecast is hot");
                     }
                     else {
                        System.out.println("The forecast is warm");
                     }
                  }
                  else if (tmp.getScale() == 'C') {
                     if (tmp.getTemp() >= 32 && wthr.getWindSp() < 10 && wthr.getHumidity() >= 70) {
                        System.out.println("The forecast is steamy");
                     }
                     else if (tmp.getTemp() >= 32 && wthr.getWindSp() >= 20 && wthr.getHumidity() >= 70) {
                        System.out.println("The forecast is stormy");
                     }
                     else if (tmp.getTemp() >= 30 && wthr.getHumidity() < 50) {
                        System.out.println("The forecast is dry heat");
                     }
                     else if (tmp.getTemp() < 32 && tmp.getTemp() >= 30 && wthr.getWindSp() >= 20) {
                        System.out.println("The forecast is hot and windy");
                     }
                     else if (tmp.getTemp() >= 30) {
                        System.out.println("The forecast is hot");
                     }
                     else {
                        System.out.println("The forecast is warm");
                     }
                  }
               }
               else if (ssn.getSeason().equals("fall") || ssn.getSeason().equals("autumn")) {
                  if (tmp.getScale() == 'F') {
                     if (tmp.getTemp() >= 65 && tmp.getTemp() < 80 && wthr.getWindSp() < 15 && wthr.getHumidity() <= 60) {
                        System.out.println("The forecast is nice");
                     }
                     else if (tmp.getTemp() >= 80.6) {
                        System.out.println("The forecast is too warm");
                     }
                     else if (tmp.getTemp() >= 40 && tmp.getTemp() < 65 && wthr.getWindSp() > 15) {
                        System.out.println("The forecast is chilly");
                     }
                     else if (wthr.getHumidity() >= 80) {
                        System.out.println("The forecast is rainy");
                     }
                     else {
                        System.out.println("The forecast is typical");
                     }
                  }
                  else if (tmp.getScale() == 'C') {
                     if (tmp.getTemp() >= 18.333 && tmp.getTemp() < 26.666 && wthr.getWindSp() < 15 && wthr.getHumidity() <= 60) {
                        System.out.println("The forecast is nice");
                     }
                     else if (tmp.getTemp() >= 27) {
                        System.out.println("The forecast is too warm");
                     }
                     else if (tmp.getTemp() >= 4.444 && tmp.getTemp() < 65 && wthr.getWindSp() > 15) {
                        System.out.println("The forecast is chilly");
                     }
                     else if (wthr.getHumidity() >= 26.666) {
                        System.out.println("The forecast is rainy");
                     }
                     else {
                        System.out.println("The forecast is typical");
                     }
                  }
               }
               else if (ssn.getSeason().equals("spring")) {
                  if (tmp.getScale() == 'F') {
                     if (tmp.getTemp() > 65 && tmp.getTemp() <= 80 && wthr.getWindSp() >= 20 && wthr.getHumidity() >= 80) {
                        System.out.println("The forecast is stormy");
                     }
                     else if (tmp.getTemp() < 50) {
                        System.out.println("The forecast is chilly");
                     }
                     else if (wthr.getHumidity() < 80 && wthr.getWindSp() >= 20) {
                        System.out.println("The forecast is windy");
                     }
                     else {
                        System.out.println("The forecast is pleasant");
                     }
                  }
                  else if (tmp.getScale() == 'C') {
                     if (tmp.getTemp() > 18.333 && tmp.getTemp() <= 26.666 && wthr.getWindSp() >= 20 && wthr.getHumidity() >= 80) {
                        System.out.println("The forecast is stormy");
                     }
                     else if (tmp.getTemp() < 10) {
                        System.out.println("The forecast is chilly");
                     }
                     else if (wthr.getHumidity() < 26.666 && wthr.getWindSp() >= 20) {
                        System.out.println("The forecast is windy");
                     }
                     else {
                        System.out.println("The forecast is pleasant");
                     }
                  }
               }
               break;
            case 5:
               System.out.printf("The weather is currently %f degrees %c with %d%% humidity "
                              + "and a %d mph wind from the %s\n", tmp.getTemp(), tmp.getScale(), wthr.getHumidity(), wthr.getWindSp(), wthr.getWindDir() );
               break;
         }
      }
   }
}