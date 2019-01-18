package cards;

import cards.Card;
import cards.Deck;
import cards.enums.PinochleCard;
import cards.enums.Suit;

public class Pinochle extends Deck {
  @Override
  public void init() {
    for (Suit suit : Suit.values()) {
      for (PinochleCard value : PinochleCard.values()) {
        getCards().add(new Card(suit, value));
        getCards().add(new Card(suit, value));
      }
    }
  }
}
