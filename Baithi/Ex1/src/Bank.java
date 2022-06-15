public class Bank {
    private double balance ;
    private double rate;
    private double interest;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest(){
        return interest=balance*(rate/1200);
    }
}
