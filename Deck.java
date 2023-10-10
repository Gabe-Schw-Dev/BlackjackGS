import java.util.*; // Import all java utilities
public class Deck { // Coded by Xikuno-Dev
    private final ArrayList<Card> deck; // Create ArrayList deck
    public Deck() {
        // Constructor assigns Rank.values() to var allRanks and Suit.values() to var allSuits
        // Assigns new ArrayList to this.deck with an initial capacity of 312
        // Adds cards of all ranks and suits to ArrayList deck 6 times
        var allRanks = Rank.values();
        var allSuits = Suit.values();
        this.deck = new ArrayList<Card>(312);
        for (int i = 0; i < 6; i++) {
            for (var Rank : allRanks) {
                for (var Suit : allSuits) {
                    deck.add(new Card(Rank, Suit));
                }
            }
        }
        // System.out.println(deck); // For testing purposes; comment out
        // System.out.println(deck.size()); // For testing purposes; comment out
    }
    public void shuffle() { // Method shuffles ArrayList deck
        Collections.shuffle(deck);
        // System.out.println(deck); // For testing purposes; comment out
        // System.out.println(deck.size()); // For testing purposes; comment out
    }
    public void reshuffle() {
        // Method assigns Rank.values() to var allRanks and Suit.values() to var allSuits
        // Adds cards of all ranks and suits to ArrayList deck 6 times
        // Calls shuffle() to shuffle ArrayList deck
        var allRanks = Rank.values();
        var allSuits = Suit.values();
        for (int i = 0; i < 6; i++) {
            for (var Rank : allRanks) {
                for (var Suit : allSuits) {
                    deck.add(new Card(Rank, Suit));
                }
            }
        }
        shuffle();
    }
    public boolean isEmpty() { // Method returns true if deck.isEmpty(), false if otherwise
        return deck.isEmpty();
    }
    public int getRemainingCards() { // Method returns size of ArrayList deck
        return deck.size();
    }
    public Card draw() {
        // Method returns value of Card removed from ArrayList deck index 0
        // If ArrayList deck is empty:
        // Call reshuffle() method to add fresh cards, call draw() recursively to attempt another draw
        if (this.isEmpty()) {
            reshuffle();
            draw();
        }
        return deck.remove(0);
    }
    // public void testing() { // For testing purposes; comment out
        // System.out.println(deck);
        // System.out.println(deck.size());
    // }
}