import java.util.*; // Import utility classes
public class Deck { // Coded by XIKUNO !!!
    ArrayList<String> deck = new ArrayList<>(); // Create deck arraylist
    public Deck() { // Initialize deck
        deck.add("Ace of Hearts"); // Add elements to deck arraylist \/\/\/
        deck.add("2 of Hearts");
        deck.add("3 of Hearts");
        deck.add("4 of Hearts");
        deck.add("5 of Hearts");
        deck.add("6 of Hearts");
        deck.add("7 of Hearts");
        deck.add("8 of Hearts");
        deck.add("9 of Hearts");
        deck.add("10 of Hearts");
        deck.add("Jack of Hearts");
        deck.add("Queen of Hearts");
        deck.add("King of Hearts");
        deck.add("Ace of Clubs");
        deck.add("2 of Clubs");
        deck.add("3 of Clubs");
        deck.add("4 of Clubs");
        deck.add("5 of Clubs");
        deck.add("6 of Clubs");
        deck.add("7 of Clubs");
        deck.add("8 of Clubs");
        deck.add("9 of Clubs");
        deck.add("10 of Clubs");
        deck.add("Jack of Clubs");
        deck.add("Queen of Clubs");
        deck.add("King of Clubs");
        deck.add("King of Diamonds");
        deck.add("Queen of Diamonds");
        deck.add("Jack of Diamonds");
        deck.add("10 of Diamonds");
        deck.add("9 of Diamonds");
        deck.add("8 of Diamonds");
        deck.add("7 of Diamonds");
        deck.add("6 of Diamonds");
        deck.add("5 of Diamonds");
        deck.add("4 of Diamonds");
        deck.add("3 of Diamonds");
        deck.add("2 of Diamonds");
        deck.add("Ace of Diamonds");
        deck.add("King of Spades");
        deck.add("Queen of Spades");
        deck.add("Jack of Spades");
        deck.add("10 of Spades");
        deck.add("9 of Spades");
        deck.add("8 of Spades");
        deck.add("7 of Spades");
        deck.add("6 of Spades");
        deck.add("5 of Spades");
        deck.add("4 of Spades");
        deck.add("3 of Spades");
        deck.add("2 of Spades");
        deck.add("Ace of Spades");
        // System.out.println(deck); // Print deck arraylist (TESTING purposes, comment out)
        shuffle(); // Call shuffle method
    }
    public void shuffle() { // Randomize elements of deck array
        Collections.shuffle(deck);
        // System.out.println(deck); // Print deck arraylist (TESTING purposes, comment out)
    }
    public void deal() {
    }
}