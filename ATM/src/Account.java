import java.util.ArrayList;
import java.util.List;

public class Account {

    private String accountNumber;
    private String holderName;
    private double balance;

    private List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if(amount<=0){
            System.out.println("Invalid deposit amount");
            return;
        }
        balance +=amount;
        System.out.println("₹"+amount+" deposited successfully");
        System.out.println("Current balance is: ₹"+balance);
    }

    public void withdraw(double amount) {
        if(amount<=0){
            System.out.println("Invalid withdrawal amount");
            return;
        }
        if(amount>balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance -=amount;
        System.out.println("Please collect your cash!!");
        System.out.println("Current balance is: "+balance);
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions found");
            return;
        }
        for(Transaction transaction : transactions){
            transaction.displayDetails();
        }
    }
}
