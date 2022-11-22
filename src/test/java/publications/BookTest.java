package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    private Book book;

    //white Book ---class name;
    //purple Book above and below --- object name;
    //white Book() --- constructor;
    @BeforeEach
    public void setUp(){

        LocalDate date = LocalDate.of(1996, 6, 29);
        book = new Book("Harry Potter", date, "Bloomsbury", 34.99, 4200, true, true, "This book received unanimous praise");

    }

    @Test
    public void canBecomeDusty(){
        String expected = "This book is full of dust, either read it or sell it to someone who would treasure it!";
        String actual = book.becomeDusty();
        assertEquals(expected, actual);
    }

    @Test
    public void canBecomeDustyWithDescription(){
        String description = book.getDescription();
        String expected = "This book received unanimous praise but end up dusty in your shelf. If you don't read it, why buy it in the first place?";
        String actual = book.becomeDusty(description);
        assertEquals(expected, actual);
    }

}
