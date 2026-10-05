import java.util.ArrayList;
import java.util.List;

public class Member {

    private int memberId;
    private String name;
    private List<Book> borrowedBook;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBook = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if(book.isAvailable()){
            book.borrowBook();
            borrowedBook.add(book);
            System.out.println(name + " borrowed "+ book.getTitle());
        }
        else{
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        if(borrowedBook.contains(book)){
            borrowedBook.remove(book);
            book.returnBook();
            System.out.println(name + " returned "+ book.getTitle());
        }
        else{
            System.out.println("This member did not borrow this book..");
        }
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBook() {
        return borrowedBook;
    }
}
