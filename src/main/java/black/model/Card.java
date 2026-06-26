package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public final class Card extends Payment {
    private String cardNumber;
    private String cvv2;
    private LocalDate expireDate;
}
