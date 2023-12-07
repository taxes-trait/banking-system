// Transaction.java
public class Transaction {
    public static void transfer(Account sender, Account receiver, double amount) {
        if (amount > 0 && amount <= sender.getBalance()) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred $" + amount + " from account " + sender.getAccountNumber() +
                    " to account " + receiver.getAccountNumber());
        } else {
            System.out.println("Invalid transfer from account " + sender.getAccountNumber() +
                    " to account " + receiver.getAccountNumber());
        }
    }
}
