package test;

import main.Customer;
import main.Movie;
import main.Rental;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testStatement() {
        // Arrange
        Customer customer = new Customer("John Doe");
        customer.addRental(new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 3));
        customer.addRental(new Rental(new Movie("Lord of the Rings", Movie.REGULAR), 5));
        customer.addRental(new Rental(new Movie("Star Wars", Movie.NEW_RELEASE), 1));

        // Act
        String statement = customer.statement();

        // Assert
        String expectedStatement = "main.Rental Record for John Doe\n" +
                "\tHarry Potter\t1.5\n" +
                "\tLord of the Rings\t6.5\n" +
                "\tStar Wars\t3.0\n" +
                "Amount owed is 11.0\n" +
                "You earned 3 frequent renter points";
        assertEquals(expectedStatement, statement);
    }
}