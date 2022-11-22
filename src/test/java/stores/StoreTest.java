package stores;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import publications.Book;
import publications.Publication;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    private Store store;

    @BeforeEach
    public void setUp(){
        store = new Store("Notting Hill");
    }

    @Test
    public void canCountPublications(){
        int expected = 0;
        int actual = store.countPublications();
        assertEquals(expected, actual);
    }

    @Test
    public void canAddPublication(){
        Publication publication = new Book("Harry Potter", LocalDate.of(1996, 6, 29), "Bloomsbury", 34.99, 4200, true, true, "This book received unanimous praise");
        store.addPublication(publication);
        int expected = 1;
        int actual = store.countPublications();
        assertEquals(expected, actual);
    }

}
