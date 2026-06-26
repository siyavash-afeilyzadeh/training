package black;


import black.model.Cash;

import static black.model.Currency.Dollar;

public class Test {
    public static void main(String[] args) {
        Cash cash1 = new Cash();
        cash1.setAmount(42000);
        cash1.setCurrency(Dollar);
        System.out.println(cash1);
    }

}
