public enum Suit { // Coded by Xikuno-Dev
    hearts("HEARTS"), // Start of Suit values
    clubs("CLUBS"),
    diamonds("DIAMONDS"),
    spades("SPADES"); // End of Suit values
    private final String display; // Declare String display
    Suit(String display) { // Constructor assigns String display to Suit
        this.display = display;
    }
    public String getDisplay() { // Method returns String display
        return display;
    }
    @Override
    public String toString() { // Method returns String display, overrides getDisplay()
        return display;
    }
}