// Name : Joel Sare
// Class : CIST1400-015   Lab Section
// Colleagues : NAME/EMAIL OF ANYONE YOU WORKED WITH, INCLUDING TUTORS
// Resources : SUFFICIENT INFORMATION AND CREDIT GIVEN TO ANY RESOURCES
//                BEYOND THOSE DIRECTLY PROVIDED BY YOUR INSTRUCTOR.   

public class OldBunco {

   public static void main (String[] args) {
   
      Die val = new Die();
      int roll1, roll2, roll3;
      int roundScore = 0;
      int totalScore = 0;
      int j = 0;
      
      System.out.println("Welcome to the Bunco Game");
      
      for (int i = 1; i <= 6; i++) {
         System.out.println("ROUND " + i);
         while (roundScore < 21) {
            roll1 = val.roll();
            roll2 = val.roll();
            roll3 = val.roll();
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
         System.out.printf("Your score for round %d is %d\n", i, roundScore);
         roundScore = 0;
      }
      System.out.printf("Score for all rounds is %d", totalScore);
   }
}

