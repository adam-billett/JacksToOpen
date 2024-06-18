import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameLogic {
    private List<Player> players;
    private Deck deck;

    public GameLogic() {
        players = new ArrayList<>();
        deck = new Deck();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        deck.shuffle();

        System.out.print("How many players will there be: ");
        int numPlayers = sc.nextInt();

        for (int i = 0; i < numPlayers; i++) {
            System.out.print(STR."Enter username for player \{i + 1}: ");
            String username = sc.next();
            players.add(new Player(username, 10000));
        }
        dealCards();
        }

    public void dealCards() {
        for (Player player : this.players) {
            for (int i = 0; i < 5; i++) {
                Card card = deck.dealCard();
                player.addCardToHand(card);
                System.out.println(STR."\{player.getUsername()} hand: \{player.getHand()}");
            }
        }
    }
}

