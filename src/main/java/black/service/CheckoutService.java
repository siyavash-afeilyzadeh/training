package black.service;

import black.model.Customer;
import black.model.Order;
import black.model.Payment;

public class CheckoutService {
public static void checkout(Customer customer, Payment payment) {
    double total = 0;
    for (Order order : customer.getOrders()) {
        total += order.getRialPrice();
    }
    System.out.println("Total: " + total);
    payment.pay(total);
}

}
