import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    private Movie movie;

    @BeforeEach
    public void setUp(){
        movie = new Movie("Enola Holmes", "mystery", 123);
    }

    @Test
    public void canReceiveRating(){
        String expected = "Average rating of this movie: 8 out of 10.";
        String actual = movie.receiveRating(8);
        assertEquals(expected, actual);
    }
}
