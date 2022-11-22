package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewspaperTest {

    private Newspaper newspaper;

    @BeforeEach
    public void setUp(){
        newspaper = new Newspaper("The Times", LocalDate.of(1788, 1, 1), "News UK", 1.5, 10, "broadsheet");
    }

    @Test
    public void canBecomeDusty(){
        String expected = "All right but before throwing them away, newspapers are perfect for window cleaning!";
        String actual = newspaper.becomeDusty();
        assertEquals(expected, actual);
    }

}
