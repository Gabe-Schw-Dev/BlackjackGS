import java.util.*; // Import all java utilities
public class Hand { // Coded by Xikuno-Dev
    private final Set<Card> hand; // Create Set hand
    private int totalValue; // Declare int totalValue
    public Hand() {
        // Constructor assigns a HashSet to current Hand's Set hand
        // Assigns a value of 0 to current Hand's int totalValue
        this.hand = new HashSet<>();
        this.totalValue = 0;
    }
    public void addCard(Card card) {
        // Method adds a Card to Set hand
        // Adds the value of the Card's Rank to int totalValue
        hand.add(card);
        totalValue += card.getRank().getValue();
    }
    public void removeCard(Card card) {
        // Method removes a Card from Set hand
        // Subtracts the value of the Card's Rank from int totalValue
        hand.remove(card);
        totalValue -= card.getRank().getValue();
    }
    public String toString() {
        // Method returns string containing description of:
        // Contents of current hand
        // Value of current hand
        return "Current Hand: " + hand +
                "Value of Current Hand: " + totalValue;
    }
}