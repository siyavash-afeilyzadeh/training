package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public final class Check implements Payment {
    private Bank bank;
    private LocalDate checkDate;

    @Override
   public void pay(double amount) {
        System.out.println("Paid with Check");
    }
}
