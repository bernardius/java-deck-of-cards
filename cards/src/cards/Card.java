package cards;

import cards.enums.Suit;
import cards.enums.CardValue;

public class Card {

  private final CardValue cardValue;
  private final Suit suit;

  public Card(Suit suit, CardValue cardValue) {
    //I would normally use preconditions for checking inputs
    if (suit == null || cardValue == null) {
      throw new IllegalArgumentException("Card input must not be null");
    }

    this.cardValue = cardValue;
    this.suit = suit;
  }

  public CardValue getCardValue() {
    return cardValue;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Card card = (Card) o;

    if (!cardValue.equals(card.cardValue)) {
      return false;
    }
    return suit == card.suit;
  }

  @Override
  public int hashCode() {
    int result = cardValue.hashCode();
    result = 31 * result + suit.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return cardValue.name() + " of the suite" + suit.name();
  }
}

