package black.service;

public class CurrencyConvertor {
   private final static double USD_IRT = 0.161F;
    public static double toRial(double amount) {
        return amount * USD_IRT;
    }
    public static double toUSD(double amount){
        return amount/USD_IRT;
    }
}
