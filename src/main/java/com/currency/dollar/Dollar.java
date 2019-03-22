package com.currency.dollar;

/**
 * @author abhar
 * @date 22/03/2019
 */
public class Dollar {

    protected int amount;

    private static final double CENTS_PER_DOLLAR = 100;

    public Dollar(double amount) {
        this.amount = (int) (amount * CENTS_PER_DOLLAR);
    }

    @Override
    public String toString() {
        return String.format("USD %.2f", (double) amount / CENTS_PER_DOLLAR);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Dollar) && amount == ((Dollar) o).amount;
    }

    public Dollar minus(Dollar subtrahend) {
        Dollar result = new Dollar(0);
        result.amount = amount - subtrahend.amount;
        return result;
    }
}
