public class Application {
    public static void main(String[] args) {
        Bank bank= new Bank(1200,0.1);
        System.out.println("Interes " + bank.calculateInterest());
    }
}
