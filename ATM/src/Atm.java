import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Atm {
    private Map<String,Card> cards;
    private Scanner scanner;

    public Atm(){
        cards = new HashMap<String,Card>();
        scanner = new Scanner(System.in);
    }

    public void addCard(Card card){
        cards.put(card.getCardNumber(),card);
    }

    public void start(){
        System.out.println("===== WELCOME TO ATM =====");

        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();

        Card card = cards.get(cardNumber);
        if(card==null){
            System.out.println("Card not found.");
            return;
        }
        System.out.println("Enter PIN: ");
        String pin = scanner.nextLine();

        if(!card.validatePin(pin)){
            return;
        }
        System.out.println("Login successful!");
        showMenu(card);
    }

    private void showMenu(Card card){
        Account account = card.getAccount();
        while(true){
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");

            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Balance: ₹" + account.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Enter amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 4:
                    account.showTransactions();
                    break;
                case 5:
                    System.out.println("Thank you!!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
