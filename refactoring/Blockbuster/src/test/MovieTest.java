package test;

import static org.junit.Assert.*;
import main.Movie;
import org.junit.Before;
import org.junit.Test;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp() {
        movie = new Movie("Harry Potter", Movie.CHILDRENS);
    }

    @Test
    public void testGetPriceCode() {
        assertEquals(Movie.CHILDRENS, movie.getPriceCode());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Harry Potter", movie.getTitle());
    }

    @Test
    public void setPriceCode() {
        // Act
        movie.setPriceCode(0);

        // Assert
        assertEquals(0, movie.getPriceCode());
    }
}
