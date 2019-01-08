import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class LibraryTest {

    Library library, smallLibrary;
    Book book1, book2, book3, book4;

    @Before
    public void beforeEach(){
        library = new Library(200);
        smallLibrary = new Library(3);
    }

    @Test
    public void canCheckCapacity(){
        assertEquals(200, library.totalCapacity());
    }

    @Test
    public void canCheckLibraryInitiallyEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        assertEquals(0, library.bookCount());
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canAddMultipleBooks(){
        assertEquals(0, library.bookCount());
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        library.addBook(book2);
        assertEquals(2, library.bookCount());
        library.addBook(book3);
        assertEquals(3, library.bookCount());
        library.addBook(book4);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void cantAddBooksBeyondCapacity(){
        assertEquals(0, smallLibrary.bookCount());
        smallLibrary.addBook(book1);
        assertEquals(1, smallLibrary.bookCount());
        smallLibrary.addBook(book2);
        assertEquals(2, smallLibrary.bookCount());
        smallLibrary.addBook(book3);
        assertEquals(3, smallLibrary.bookCount());
        smallLibrary.addBook(book4);
        assertEquals(3, smallLibrary.bookCount());
    }

    

}
