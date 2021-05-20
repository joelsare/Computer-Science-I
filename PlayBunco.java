import java.util.Scanner;
public class PlayBunco {

   public static void main (String [] args) {
      Scanner get = new Scanner(System.in);
   
      int value;
      int score = 0, p1Score = 0, p2Score = 0;
      System.out.println("Welcome to the new and improved Bunco game.");
   
      do {
         System.out.println("What size die do you want to play with? Will be # of rounds.");
         System.out.print("Should be at least 4: ");
         value = get.nextInt();
      } while (value < 4);
   
      Bunco b = new Bunco(value);
      
      for (int rd = 1; rd <= value; rd++) {
         for (int p = 1; p <= 2; p++) {
            if (p == 1) {
               score = b.play(rd);
               p1Score += score;
               System.out.printf("Player %d's score for round %d is %d\n", p, rd, score);
            }
            else {
               score = b.play(rd);
               p2Score += score;
               System.out.printf("Player %d's score for round %d is %d\n", p, rd, score);
            }
         }
      }
      if (p1Score > p2Score) {
         System.out.printf("Player 1 won with %d points. Player 2 had %d points.\n", p1Score, p2Score);
      }
      else if (p1Score < p2Score) {
         System.out.printf("Player 2 won with %d points. Player 1 had %d points.\n", p2Score, p1Score);
      }
      else if (p1Score == p2Score) {
         System.out.printf("Player 1 and player two tied with a score of\n", p1Score);
      }
   }
}