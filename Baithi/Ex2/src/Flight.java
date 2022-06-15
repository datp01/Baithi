public class Flight {
    private String destination;
    private int number;

    public Flight(String destination, int number) {
        this.destination = destination;
        this.number = number;
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
