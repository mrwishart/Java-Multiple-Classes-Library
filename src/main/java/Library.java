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
        if (!isFull()) {
            bookCollection.add(book1);
        }
    }

    public boolean isFull(){
        return bookCollection.size() == capacity;
    }

    public boolean isEmpty() {
        return bookCollection.isEmpty();
    }


    public Book removeBook() {
        if (!isEmpty()){
            return bookCollection.remove(0);
        } else {
            return null;
        }
    }
}
