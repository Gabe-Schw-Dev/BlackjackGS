public class Card { // Coded by Xikuno-Dev
    private final Rank rank; // Declare Rank
    private final Suit suit; // Declare Suit
    public Card(Rank rank, Suit suit) { // Constructor assigns Rank and Suit to Card
        this.rank = rank;
        this.suit = suit;
    }
    public Rank getRank() { // Method returns Rank
        return rank;
    }
    public Suit getSuit() { // Method returns Suit
        return suit;
    }
    public String toString() { // Method returns string containing Card description
        return rank.toString() + " of " + suit.toString();
    }
}