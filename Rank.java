public enum Rank { // Coded by Xikuno-Dev
    ace(1, "ACE"), // Start of Rank values
    two(2, "2"),
    three(3, "3"),
    four(4, "4"),
    five(5, "5"),
    six(6, "6"),
    seven(7, "7"),
    eight(8, "8"),
    nine(9, "9"),
    ten(10, "10"),
    jack(10, "JACK"),
    queen(10, "QUEEN"),
    king(10, "KING"); // End of Rank values
    private final int value; // Declare int value
    private final String display; // Declare String display
    Rank(int value, String display) { // Constructor assigns int value and String display to Rank
        this.value = value;
        this.display = display;
    }
    public int getValue() { // Method returns int value
        return value;
    }
    public String getDisplay() { // Method returns String display
        return display;
    }
    @Override
    public String toString() { // Method returns String display, overrides getDisplay()
        return display;
    }
}