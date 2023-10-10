public class Player { // Coded by Xikuno-Dev
    protected String name; // Create String name
    protected Hand hand; // Create Hand
    public Player(String name) {
        // Constructor assigns String name to current String name
        // Assigns a new Hand to the current Hand
        // Prints a join message for the new Player
        this.name = name;
        this.hand = new Hand();
        System.out.println(name + " has joined the game.");
    }
    public void giveCard(Card card) { // Method adds a Card to the Hand
        hand.addCard(card);
    }
    public String getName() { // Method returns String name
        return name;
    }
    public String toString() {
        // Method returns string containing description of:
        // Player's name
        // Contents of current hand
        return "Player: " + name +
                "Current Hand: " + hand;
    }
}