package publications;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagazineTest {

    private Magazine magazine;

    @BeforeEach
    public void setUp(){

        magazine = new Magazine("Economist", LocalDate.of(1843, 9, 1), "The Economist Group", 3.53, 80, false);

    }

    @Test
    public void canBecomeDusty(){
        String expected = "It's useless now. Throw it away!";
        String actual = magazine.becomeDusty();
        assertEquals(expected, actual);
    }


}
