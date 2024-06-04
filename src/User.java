public class User {
    private String username;
    private String passwordHash;
    private Balance balance;

    public User(String username, String passwordHash, int initialBalance) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.balance = new Balance(initialBalance);
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public Balance getBalance() {
        return balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public void setBalance(Balance balance) {
        this.balance = balance;
    }

    public boolean authenticate(String password) {
        return this.passwordHash.equals(password);
    }
}
