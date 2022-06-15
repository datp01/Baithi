
import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    int number;
    String destination;
    private Application list;

    public Application(int number, String destination) {
        this.number = number;
        this.destination = destination;
    }


    public void add(Application flight) {
        this.list.add(flight);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Destination: "); String destination = sc.nextLine();
        System.out.print("Enter Number: "); int number = sc.nextInt();
        Application flight = new Application(number, destination);
        if (number == 0 || destination == null) {
            System.err.println("Number should be positive-valued.");
        } else {
            System.out.println("Succesfull");
            add(flight);
            display();
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