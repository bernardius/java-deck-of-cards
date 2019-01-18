package cards.enums;

public enum PinochleCard implements CardValue {
  NINE(0),
  TEN(10),
  JACK(2),
  QUEEN(3),
  KING(4),
  ACE(11);

  private final int value;

  PinochleCard(final int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
