package black.service;

import black.model.Customer;
import black.model.Order;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    @Getter
    private static List<Customer> customers = new ArrayList<>();

    public static void save(Customer customer) {
        customers.add(customer);
        System.out.println("Customer Registered Successfully!");
    }

    public static void printCustomersList() {
        System.out.println(customers);
    }
}


