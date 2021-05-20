// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.

public class Bunco2 {

   public static void main (String [] args) {
   
      Die num = new Die();
      
      int roundScore = 0;
      int totalScore = 0;
      int roll1, roll2, roll3;
      int j = 10;
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("ROUND " + i);
         while (roundScore < 21) {
            roll1 = num.roll();
            roll2 = num.roll();
            roll3 = num.roll();
            System.out.printf("You rolled a %d and a %d and a %d\n", roll1, roll2, roll3);
            if (roll1 == roll2 && roll2 == roll3 && roll3 == i) {
               System.out.println("       BUNCO");
               roundScore += 21;
               totalScore += 21;
               break;
            }
            if (roll1 == roll2 && roll2 == roll3 && roll3 != i) {
               System.out.println("       mini bunco");
               roundScore += 5;
               totalScore += 5;
            }
            else if (roll1 == roll2 && roll2 == i) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll2 == roll3 && roll3 == i) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll1 == roll3 && roll3 == i) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll1 == i || roll2 == i || roll3 == i) {
               roundScore += 1;
               totalScore += 1;
            }
            else {
               break;
            }
         }
      }
      
   }
}