package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Deck {

  private ArrayList<Card> cards;

  public abstract void init();

  public Deck() {
    cards = new ArrayList<>();
  }

  public ArrayList<Card> getCards() {
    return cards;
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public void split(int index) {
    ArrayList<Card> temp = this.getCards();

    if(index > cards.size() || index <= 0) {
      throw new IllegalArgumentException("Index must exist in card length");
    }
    List<Card> fromTop = temp.subList(index, temp.size() - index);
    List<Card> fromBottom = temp.subList(0, index-1);

    cards.addAll(fromBottom);
    cards.addAll(fromTop);
  }

  public void deal() {
    this.cards.remove(0);
  }

  public Card turnOver () {
    return this.cards.get(0);
  }

  public int search(Card card) {
    return cards.indexOf(card) + 1;
  }

  public void setCards(ArrayList<Card> newCards) {
    this.cards = newCards;
  }

}
