package company.com;

public class Check implements Account {
    private double rate = 0.15;
   // private double balance=6000;
    public double intrest(double balance) {
        return balance*rate;
    }
}
