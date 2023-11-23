package main.eu.sig.training.maintainabilitybook.ch04_duplication.bankaccounts;

/**
 * 
 */
public class Money {

    @SuppressWarnings("unused")
    public boolean greaterThan(int limit) {
        return true;
    }

    @SuppressWarnings("unused")
    public Money multiply(float factor) {
        return this;
    }

    @SuppressWarnings("unused")
    public void add(Money money) {}

    @SuppressWarnings("unused")
    public void substract(Money interest) {}
    
}