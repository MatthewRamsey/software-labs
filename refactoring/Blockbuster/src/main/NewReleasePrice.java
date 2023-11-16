package main;

public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    protected double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    protected int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2: 1;
    }
}
