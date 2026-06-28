package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public final class Card implements Payment {
    private String cardNumber;
    private String cvv2;
    private LocalDate expireDate;

    @Override
    public void pay(double amount) {
        System.out.println("Paid with Card");

    }
}
