package cards;

import cards.enums.StandardCard;
import cards.enums.Suit;

public class Standard extends Deck {
  @Override
  public void init() {
    if (getCards().size() > 0) {
      getCards().clear();
    }

    for (Suit suit : Suit.values()) {
      for (StandardCard value : StandardCard.values()) {
        getCards().add(new Card(suit, value));
      }
    }
  }
}
