import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Integer, Book> books;
    private Map<Integer, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    public void addBook(Book book){
        books.put(book.getBookdId(),book);
        System.out.println("Books Added: " + book.getTitle());
    }

    public void addMember(Member member){
        members.put(member.getMemberId(),member);
        System.out.println("Members Registered: " + member.getName());
    }

    public Book searchBook(int bookdId){
        return books.get(bookdId);
    }

    public Member findMember(int memberId){
        return members.get(memberId);
    }

    public void borrowBook(int memberId, int bookId){
        Member member = members.get(memberId);
        Book book = books.get(bookId);
        if(member==null){
            System.out.println("Member Not Found");
            return;
        }
        if(book==null){
            System.out.println("Book Not Found");
            return;
        }

        member.borrowBook(book);
    }
    public void returnBook(int memberId, int bookId) {

        Member member = members.get(memberId);
        Book book = books.get(bookId);

        if (member == null || book == null) {
            System.out.println("Invalid member or book.");
            return;
        }

        member.returnBook(book);
    }

}
