import cards.Deck;
import cards.Standard;

public class main {
  public static void main(String[] args) {
    Deck deck = new Standard();
    deck.init();
    System.out.println(deck.getCards().toString());
  }
}
