public class Player {
    private String name;
    private Balance balance;
    private int bet;

    public Player(String name, int initialBalance) {
        this.name = name;
        this.balance = new Balance(initialBalance);
        this.bet = 0;
    }

    public String getName() {
        return name;
    }

    public Balance getBalance() {
        return balance;
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
}
