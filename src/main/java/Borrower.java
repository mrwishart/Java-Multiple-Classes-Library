import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> bookCollection;

    public Borrower(String name){
        this.name = name;
        this.bookCollection = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public int numberOfBorrowedBooks() {
        return bookCollection.size();
    }

    public void addBook(Book book1) {
        bookCollection.add(book1);
    }


}
