public class Card {
    private String cardNumber;
    private String pin;
    private Account account;

    private int failedAttempts;
    private boolean blocked;

    public Card(String cardNumber, String pin, Account account){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
        this.failedAttempts=0;
        this.blocked=false;
    }

    public boolean validatePin(String enteredPin){
        if(blocked){
            System.out.println("Card is blocked.");
            return false;
        }
        if(this.pin.equals(enteredPin)){
            failedAttempts=0;
            return true;
        }
        else{
            failedAttempts++;
            System.out.println("Incorrect pin.");
            if(failedAttempts >= 3){
                blocked=true;
                System.out.println("Card blocked after 3 failed attempts");
            }
        }
        return false;
    }

    public Account getAccount(){
        return account;
    }

    public String getCardNumber(){
        return cardNumber;
    }
}
