package black;

import black.model.*;
import black.service.CheckoutService;
import black.service.CustomerService;
import black.service.OrderService;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckoutServiceTest {
    public static void main(String[] args) {

        Customer customer1 = Customer
                .builder()
                .id(1)
                .name("Sia")
                .family("Afil")
                .age(32)
                .build();
        Customer customer2 = Customer
                .builder()
                .id(2)
                .name("Hamid")
                .family("Afil")
                .age(66)
                .build();
        Customer customer3 = Customer
                .builder()
                .id(3)
                .name("Arash")
                .family("Kasravi")
                .age(24)
                .build();

        Order order1 = Order.builder().id(1).name("Mobile").quantity(1).price(1200).currency(Currency.Dollar).build();
        Order order2 = Order.builder().id(2).name("LapTop").quantity(2).price(480).currency(Currency.Rial).build();
        Order order3 = Order.builder().id(3).name("Adaptor").quantity(1).price(0.8).currency(Currency.Rial).build();
        Order order4 = Order.builder().id(4).name("Mobile").quantity(2).price(980).currency(Currency.Dollar).build();
        Order order5 = Order.builder().id(5).name("Adaptor").quantity(2).price(1.2).currency(Currency.Rial).build();
        Order order6 = Order.builder().id(6).name("TV").quantity(1).price(2550.99).currency(Currency.Dollar).build();
        Order order7 = Order.builder().id(7).name("Tablet").quantity(2).price(260.5).currency(Currency.Rial).build();
        Order order8 = Order.builder().id(8).name("Monitor").quantity(1).price(740).currency(Currency.Rial).build();
        Order order9 = Order.builder().id(9).name("Mobile").quantity(3).price(1999.99).currency(Currency.Dollar).build();

        CustomerService.save(customer1);
        CustomerService.save(customer2);
        CustomerService.save(customer3);

        CustomerService .printCustomersList();



        customer1.getOrders().add(order1);
        customer1.getOrders().add(order2);
        customer1.getOrders().add(order3);
        customer2.getOrders().add(order4);
        customer2.getOrders().add(order5);
        customer3.getOrders().add(order6);
        customer3.getOrders().add(order7);
        customer3.getOrders().add(order8);
        customer3.getOrders().add(order9);

        CustomerService .printCustomersList();

        CheckoutService.checkout(customer1 , Card
                .builder()
                .cardNumber("1234567")
                .cvv2("0456")
                .expireDate(LocalDate.of(2030,11,11))
                .build());
        CheckoutService.checkout(customer2 , new Cash());
        CheckoutService.checkout(customer3 , Check
                .builder()
                .bank(Bank.Meli)
                .checkDate(LocalDate.of(2025,11,15))
                .build());


    }
}