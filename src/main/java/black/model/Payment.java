package black.model;

public sealed interface Payment permits Card, Cash, Check  {
    void pay(double amount);

}
