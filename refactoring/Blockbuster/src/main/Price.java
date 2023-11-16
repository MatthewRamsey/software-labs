package main;

public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int daysRented);

    protected int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
