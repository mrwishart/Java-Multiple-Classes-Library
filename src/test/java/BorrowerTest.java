import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book1;

    @Before
    public void beforeEach(){
        borrower = new Borrower("Bernard Black");
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
}
