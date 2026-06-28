package black.service;

import black.model.Order;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    @Getter
    private static List<Order> orders = new ArrayList<>();

    public static void save(Order order) {
        orders.add(order);
        System.out.println("Order Registered Successfully!!");
    }
    public static void printOrderList(){
        System.out.println("Order List");
        System.out.println("-".repeat(20));
        for(Order order: orders){
            System.out.println(order);
        }
    }
}
