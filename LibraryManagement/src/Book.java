public class Book {

    private int bookdId;
    private String title;
    private String author;
    private int numOfCopies;

    public Book(int bookdId, String title, String author, int numOfCopies) {
        this.bookdId = bookdId;
        this.title = title;
        this.author = author;
        this.numOfCopies = numOfCopies;
    }

    public boolean isAvailable() {
        return numOfCopies > 0;
    }

    public void borrowBook() {
        if (numOfCopies > 0) {
            numOfCopies--;
        } else {
            System.out.println("Book Not Available");
        }
    }

    public void returnBook() {
        numOfCopies++;
    }

    public int getBookdId() {
        return bookdId;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumOfCopies() {
        return numOfCopies;
    }
}

