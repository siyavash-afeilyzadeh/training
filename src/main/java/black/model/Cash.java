package black.model;

import lombok.ToString;

import static black.model.Currency.Dollar;

public final class Cash implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid with Cash");
    }
}