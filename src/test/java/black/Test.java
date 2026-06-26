package black;


import black.model.Cash;
import black.model.Order;

import static black.model.Currency.Dollar;

public class Test {
    //    public static void main(String[] args) {
//        Cash cash1 = new Cash();
//        cash1.setAmount(42000);
//        cash1.setCurrency(Dollar);
//        System.out.println(cash1);
//    }
    public static void main(String[] args) {
        Order order1 = Order
                .builder()
                .id(3)
                .name("Mobile")
                .quantity(3)
                .price(1456.95)
                .build();

        order1.getTotal();
        order1.getTotalWithTax();

    }
}
