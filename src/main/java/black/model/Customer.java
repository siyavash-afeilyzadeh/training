package black.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Customer {
    private int id;
    private String name;
    private String family;
    private int age;

    @Builder.Default
    private List<Order> orders = new ArrayList<>();

}
