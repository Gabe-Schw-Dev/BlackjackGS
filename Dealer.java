public class Dealer extends Player {
    private final Deck deck; // Create Deck
    public Dealer(String name, Deck deck) {
        // Constructor assigns String name to parent class's current String name
        // Assigns Deck to current Deck
        super("The dealer");
        this.deck = deck;
    }
    public void dealCard(Player player) {
        // Method assigns the output from deck.draw() to var drawnCard
        // Adds var drawnCard to current Player's Hand
        // Prints an announcement
        var drawnCard = deck.draw();
        player.giveCard(drawnCard);
        System.out.println("Card dealt to " + player.getName() + ".");
    }
    public void dealerShuffle() {
        // Method calls shuffle() from class Deck
        // Prints an announcement
        deck.shuffle();
        System.out.println(name + " has shuffled the cards.");
    }
    public String toString() {
        return "Dealer's Hand : " + hand +
                "Deck Status: " + deck;
    }
}