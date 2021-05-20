public class Card {
   private String face;
   private String suit;
   private int value;
  
   public Card () {
      this.face = "Joker";
      this.suit = "Jokers";
      this.value = -1;
   }
   public Card (String cardFace, String cardSuit, int val ) {
      this.face = cardFace;
      this.suit = cardSuit;
      this.value = val;
   }
   
   public int getValue() {
      return this.value;
   }

   public String toString() {
      return face + " of " + suit;
   }

   @Override
   public boolean equals (Object o) {
      boolean result = false;
      if (o instanceof Card ) {
         Card other = (Card) o; 
         if (this.face.equals( other.face ) && this.suit.equals( other.suit ) )
            result = true;
      }
      return result;
   }
}