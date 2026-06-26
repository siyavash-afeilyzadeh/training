package black.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor

public class Order {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private double total;
    private double totalWithTax;

}
