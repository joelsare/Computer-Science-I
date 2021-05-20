public class Bunco {
   private int rounds;
   
   public Bunco() {
      rounds = Die.MIN_FACES;
   }
   
   public Bunco(int num) {
      if (num >= Die.MIN_FACES) {
         rounds = num;
      }
      else {
         rounds = Die. MIN_FACES;
      }
   }
   
   public int getRounds() {
      return rounds;
   }
   
   public int play(int rd) {
      Die val = new Die(rounds);
      int roll1, roll2, roll3;
      int roundScore = 0;
      int totalScore = 0;
            
         System.out.println("ROUND " + rd);
         while (roundScore < 21) {
            roll1 = val.roll();
            roll2 = val.roll();
            roll3 = val.roll();
            System.out.printf("You rolled a %d and a %d and a %d\n", roll1, roll2, roll3);
            if (roll1 == roll2 && roll2 == roll3 && roll3 == rd) {
               System.out.println("       BUNCO");
               roundScore += 21;
               totalScore += 21;
               break;
            }
            if (roll1 == roll2 && roll2 == roll3 && roll3 != rd) {
               System.out.println("       mini bunco");
               roundScore += 5;
               totalScore += 5;
            }
            else if (roll1 == roll2 && roll2 == rd) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll2 == roll3 && roll3 == rd) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll1 == roll3 && roll3 == rd) {
               roundScore += 2;
               totalScore += 2;
            }
            else if (roll1 == rd || roll2 == rd || roll3 == rd) {
               roundScore += 1;
               totalScore += 1;
            }
            else {
               break;
            }
      }
      return roundScore;
   }
}