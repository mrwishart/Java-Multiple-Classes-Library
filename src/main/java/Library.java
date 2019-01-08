import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> bookCollection;

    public Library(int capacity){
        this.capacity = capacity;
        bookCollection = new ArrayList<>();
    }

    public int totalCapacity(){
        return capacity;
    }

    public int bookCount() {
        return bookCollection.size();
    }

    public void addBook(Book book1) {
        if (!libraryFull()) {
            bookCollection.add(book1);
        }
    }

    private boolean libraryFull(){
        return bookCollection.size() == capacity;
    }
}
