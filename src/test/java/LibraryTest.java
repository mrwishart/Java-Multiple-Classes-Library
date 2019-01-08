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
        book1 = new Book("The Hitchhiker's Guide", "Douglas Adams", "Sci-fi");
        book2 = new Book("The God Delusion", "Richard Dawkins", "Factual");
        book3 = new Book("The Shadow Over Innsmouth", "HP Lovecraft", "Horror");
        book4 = new Book("Player Of Games", "Iain Banks", "Sci-fi");
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

    @Test
    public void libraryNotAtCapacity(){
        assertFalse(library.isFull());
    }

    @Test
    public void libraryAtCapacity(){
        smallLibrary.addBook(book1);
        smallLibrary.addBook(book2);
        smallLibrary.addBook(book3);
        assertTrue(smallLibrary.isFull());
    }

    @Test
    public void libraryEmpty(){
        assertTrue(library.isEmpty());
    }

    @Test
    public void libraryNotEmpty(){
        library.addBook(book1);
        assertFalse(library.isEmpty());
    }

    @Test
    public void canRemoveBook(){
        assertEquals(0, smallLibrary.bookCount());
        smallLibrary.addBook(book1);
        assertEquals(1, smallLibrary.bookCount());
        smallLibrary.addBook(book2);
        assertEquals(2, smallLibrary.bookCount());
        smallLibrary.addBook(book3);
        assertEquals(3, smallLibrary.bookCount());
        assertEquals(book1, smallLibrary.removeBook());
        assertEquals(2, smallLibrary.bookCount());
    }

}
