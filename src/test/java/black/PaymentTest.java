package black;

import black.model.*;

import java.time.LocalDate;

public class PaymentTest {
    public static void main(String[] args) {

    Payment payment1 = Card
            .builder()
            .cardNumber("12345")
            .cvv2("0456")
            .expireDate(LocalDate.of(2030,01,29))
            .build();
    Payment payment2 = new Cash() ;
    Payment payment3 = Check
            .builder()
            .bank(Bank.Meli)
            .checkDate(LocalDate.of(2026,11,15))
            .build();


        System.out.println(payment1);
        System.out.println(payment2);
        System.out.println(payment3);
    }
}

