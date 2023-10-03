import java.util.*;
public class Blackjack {
    public static void main(String[] args) {
        String namePlayer;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        namePlayer = scanner.next();
        Game game = new Game(namePlayer);
        System.out.println("Welcome player " + namePlayer + ".  Dealing cards...\n");
        Deck deck = new Deck();
        System.out.print("Would you like to enable betting? (Yes/No): ");
    }
}