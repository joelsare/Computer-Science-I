import java.util.Random;

public class DeckOfCards {
   private Card deck[];             // null reference to array of Card
   private int currentCard;         // position of next Card to be dealt
   private Random randoms;
   private final int NUM_OF_CARDS = 52;

   public DeckOfCards() {
      String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                   "Seven", "Eight", "Nine", "Ten", "Jack","Queen", "King" };
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
      
      randoms = new Random();          // create for shuffling
      deck = new Card[ NUM_OF_CARDS ]; // create new array
      currentCard = 0;                 // pos of next Card to deal
      
      for (int a = 0; a < deck.length; a++)
         deck[a] = new Card( faces[a%13], suits[a/13], a%13 );
   }
   
   public void shuffle () {
      currentCard = 0;              // if shuffle, reset pos next card to deal
      for ( int first = 0; first < deck.length; first++ ) { 
         int second = randoms.nextInt ( NUM_OF_CARDS );
         Card temp = deck[first];    // make copy of Card ref
         deck[first] = deck[second]; // move second Card to first
         deck[second] = temp;        // copy saved addr to second
      } 
   }
   
   public Card dealCard() {
      Card whichOne;                      // null reference to dealt Card
      if ( currentCard < deck.length ) {  // if there are Cards left
         whichOne = deck[currentCard];    // copy ref to the Card
         currentCard++;                   // move pos of next Card
      }
      else {
         whichOne = null; // no more Cards to deal! 
      }
      return whichOne;    // send Card reference out
   }
}