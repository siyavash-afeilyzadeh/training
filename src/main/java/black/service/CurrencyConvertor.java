package black.service;

public class CurrencyConvertor {
   private final static double USD_IRT = 161500F;
    public double toRial(double amount) {
        return amount * USD_IRT;
    }
    public double toUSD(double amount){
        return amount/USD_IRT
    }
}
