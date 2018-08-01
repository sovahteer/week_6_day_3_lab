public enum NumberType {
    TWO(0, "Two"),
    THREE(1, "Three"),
    FOUR(2, "Four"),
    FIVE(3, "Five"),
    SIX(4, "Six"),
    SEVEN(5, "Seven"),
    EIGHT(6, "Eight"),
    NINE(7, "Nine"),
    TEN(8, "Ten"),
    JACK(9, "Jack"),
    QUEEN(10, "Queen"),
    KING(11, "Twelve"),
    ACE(12, "Ace");

    private final int numericValue;
    private final String value;

    NumberType(int number, String value){
        this.numericValue = number;
        this.value = value;
    }

    public int getNumericValue() { return this.numericValue; }
    public String getValue() { return this.value; }
}
