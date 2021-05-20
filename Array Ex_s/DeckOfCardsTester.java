public class DeckOfCardsTester {

   public static void main (String[] args) {
   
      DeckOfCards a = new DeckOfCards();
      
      for (int i = 0; i < 55; i++) {
         Card result = a.dealCard();
         if (result != null)
            System.out.println(result);
         else
            System.out.println("You ran out of cards");
      }
      
   }
}