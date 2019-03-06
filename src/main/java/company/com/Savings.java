package company.com;

public class Savings implements Account {

   // private double amount=7000;
    private double rate=0.10;

    public double intrest(double amount) {
        return amount*rate;
    }
}
