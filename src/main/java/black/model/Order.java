package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import static black.service.CurrencyConvertor.toRial;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(onlyExplicitlyIncluded = true)

public class Order {
    @ToString.Include private int id;
    @ToString.Include private String name;
    @ToString.Include private int quantity;
    @ToString.Include private double price;
    @ToString.Include private Currency currency;

    @ToString.Include public double getTotal() {
        return Math.round(price * quantity * 100) / 100.0;
    }

    @ToString.Include public double getRialPrice() {
        if (currency == Currency.Dollar) {
            return Math.round(toRial(getTotal()) * 100) / 100.0;
        } else {
            return getTotal();
        }
    }
}
