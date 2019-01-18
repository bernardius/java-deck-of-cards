package cards.enums;

public enum Suit {
  HEART(1),
  CLUB(2),
  DIAMOND(3),
  SPADE(4);

  private int suitValue;

  Suit(int suitValue) {
    this.suitValue = suitValue;
  }

  public int getSuitValue() {
    return suitValue;
  }
}
