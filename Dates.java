// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

import java.util.Random;

public class Dates{
   public static void main (String [] args){
   SimpleDate birthday = new SimpleDate(9,15,1998);
   System.out.println(birthday);
   
   SimpleDate defaultDate = new SimpleDate();
   System.out.println(defaultDate);
   
   Random r = new Random();
   
   int randomMonth = r.nextInt(12) +1;
   int randomDay = r.nextInt(28) +1;
   int randomYear = r.nextInt(301) + 1900;
   System.out.printf("%d %d %d\n", randomMonth, randomDay, randomYear);
   
   defaultDate.setDate(randomMonth,randomDay,randomYear);
   System.out.println(defaultDate);
   
   defaultDate.nextDay();
   System.out.println(defaultDate);
   
   int month = defaultDate.getMonth();
   int day = defaultDate.getDay();
   int year = defaultDate.getYear();
   System.out.printf("%d-%d-%d", day, month, year);
   }
}