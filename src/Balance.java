public class Balance {
    private int amount;

    public Balance(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void add(int amount) {
        this.amount += amount;
    }

    public void deduct(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
