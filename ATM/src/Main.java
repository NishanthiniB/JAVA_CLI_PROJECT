public class Main{
    static void main() {
        Account account1 = new Account("ACC001","Nisha",50000);
        Account account2 = new Account("ACC002","Rithi",20000);
        Account account3 = new Account("ACC003","Suresh",30000);

        Card card1 = new Card("Card001","2000",account1);
        Card card2 = new Card("Card002","2002",account2);
        Card card3 = new Card("Card003","1998",account3);

        //Create ATM

        Atm atm = new Atm();

        atm.addCard(card1);
        atm.addCard(card2);
        atm.addCard(card3);

        atm.start();
    }
}