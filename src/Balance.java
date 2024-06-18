public class Balance {
    private int amount;

    public Balance(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Balance add(int amount) {
        this.amount += amount;
        return null;
    }

    public Balance deduct(int amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
        return null;
    }
}
