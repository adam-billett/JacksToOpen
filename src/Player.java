import java.util.ArrayList;
import java.util.List;

public class Player {
    private String username;
    private Balance balance;
    private int bet;
    private List<Card> hand;

    public Player(String username, int balance) {
        this.username = username;
        this.balance = new Balance(balance);
        this.hand = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public int getBet() {
        return bet;
    }

    public void placeBet(int amount) {
        balance.deduct(amount);
        bet = amount;
    }

    public void clearBet() {
        balance.add(bet);
        bet = 0;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

     @Override
    public String toString() {
        return STR."Player{username='\{username}\{'\''}, balance=\{balance}, hand=\{hand}\{'}'}";
    }
}
