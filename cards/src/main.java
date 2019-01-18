import cards.Deck;
import cards.Standard;

public class main {
  public static void main(String[] args) {
    Deck deck = new Standard();
    deck.init();
    System.out.println(deck.getCards().toString());
    deck.shuffle();
    for(int i = 0; i < 12; i++) {
      deck.deal();
    }
    System.out.println(deck.getCards().size());
  }
}
