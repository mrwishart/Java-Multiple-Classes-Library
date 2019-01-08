import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void beforeEach(){
        book = new Book("The Hitchhiker's Guide", "Douglas Adams", "Sci-fi");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("The Hitchhiker's Guide", book.getTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Douglas Adams", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Sci-fi", book.getGenre());
    }
}
