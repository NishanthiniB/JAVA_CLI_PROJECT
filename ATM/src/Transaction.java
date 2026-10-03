import java.time.LocalDateTime;

public class Transaction {
    private int transactionId;
    private LocalDateTime date;
    private TransactionType type;
    private double amount;


    public Transaction(int transactionId, TransactionType type, double amount){
        this.transactionId = transactionId;
        this.date = LocalDateTime.now();
        this.type = type;
        this.amount = amount;
    }

    public void displayDetails(){
        System.out.println("Transaction ID: " + transactionId
                + "| Date: " + date
                + "| Type: " + type
                + "| Amount: ₹" + amount
        );
    }
}
