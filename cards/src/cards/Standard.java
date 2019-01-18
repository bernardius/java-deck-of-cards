package cards;

import cards.enums.StandardCard;
import cards.enums.Suit;

public class Standard extends Deck {
  @Override
  public void init() {
    for (Suit suit : Suit.values()) {
      for (StandardCard value : StandardCard.values()) {
        getCards().add(new Card(suit, value));
      }
    }
  }
}
