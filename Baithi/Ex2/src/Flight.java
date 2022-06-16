
import java.util.Scanner;

public class Flight {
    int number;
    String destination;
    public Flight(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }

    public Flight() {
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Destination: "); String destination = sc.nextLine();
        System.out.print("Enter Number: "); int number = sc.nextInt();
        Flight flight = new Flight(number, destination);
        if (number == 0 || destination == null) {
            System.err.println("Number should be positive-valued.");
        } else {
            System.out.println("Succesfull");
            this.destination=destination;
            this.number=number;
        }
    }
    public String getDestination() {
        return destination;
    }

    public int getNumber() {
        return number;
    }
    public void display(){
        System.out.println(getNumber() + "," + getDestination() );
    }

}
