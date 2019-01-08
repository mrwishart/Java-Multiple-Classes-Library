import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1, book2, book3;
    Library library;

    @Before
    public void beforeEach(){
        borrower = new Borrower("Bernard Black");
        library = new Library(200);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void canGetBorrowerName(){
        assertEquals("Bernard Black", borrower.getName());
    }

    @Test
    public void canGetNumberOfBorrowedBooks(){
        assertEquals(0, borrower.numberOfBorrowedBooks());
    }

    @Test
    public void canAddBook(){
        borrower.addBook(book1);
        assertEquals(1,borrower.numberOfBorrowedBooks());
    }

    @Test
    public void canBorrowBook(){
        assertEquals(0, borrower.numberOfBorrowedBooks());
        assertEquals(3, library.bookCount());
        borrower.borrowBook(library);
        assertEquals(1, borrower.numberOfBorrowedBooks());
        assertEquals(2, library.bookCount());
    }
}
