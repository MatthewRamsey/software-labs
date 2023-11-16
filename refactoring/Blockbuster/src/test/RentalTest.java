package test;

import static org.junit.Assert.*;

import main.Movie;
import main.Rental;
import org.junit.Before;
import org.junit.Test;

public class RentalTest {
    private Rental rental;

    @Before
    public void setUp() {
        rental = new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 3);
    }

    @Test
    public void testGetDaysRented() {
        assertEquals(3, rental.getDaysRented());
    }

    @Test
    public void testGetMovie() {
        assertEquals("Harry Potter", rental.getMovie().getTitle());
    }
}
