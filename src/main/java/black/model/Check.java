package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor

public final class Check extends Payment {
    private Bank bank;
    private LocalDate checkDate;
}
