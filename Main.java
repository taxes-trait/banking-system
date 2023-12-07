// Main.java
public class Main {
    public static void main(String[] args) {
        // Create accounts
        Account account1 = new Account("12345", 1000.0);
        Account account2 = new Account("67890", 500.0);

        // Display initial account information
        account1.displayInfo();
        account2.displayInfo();

        // Perform transactions
        Transaction.transfer(account1, account2, 200.0);

        // Display updated account information
        account1.displayInfo();
        account2.displayInfo();
    }
}
