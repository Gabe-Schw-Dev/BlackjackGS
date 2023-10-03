import java.util.*; // Import utility classes
public class Blackjack { // Coded by XIKUNO !!!
    public static void main(String[] args) { // Start program
        String namePlayer; // Variables \/\/\/
        Scanner scanner = new Scanner(System.in); // Initialize scanner
        System.out.print("Please enter your name: ");
        namePlayer = scanner.next(); // Assign user input to namePlayer variable
        Game game = new Game(namePlayer); // Initialize game
        System.out.print("Welcome player " + namePlayer + ".  Dealing cards...");
        Deck deck = new Deck(); // Initialize deck
    }
}