import java.util.*;
public class Game { // Coded by XIKUNO !!!
    Scanner scanner = new Scanner(System.in);
    protected String namePlayer; // Variables \/\/\/
    protected int scorePlayer;
    protected int scoreDealer;
    public Game(String nP) { // Initialize game
        namePlayer = nP;
        scorePlayer = 0;
        scoreDealer = 0;
    }
    public void betting() {
        System.out.print("Would you like to enable betting? (Yes/No): ");
        if (scanner.next()  "Yes")
    }
}