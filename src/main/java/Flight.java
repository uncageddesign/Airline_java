import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flight;
    private String destination;
    private String departure;
    private String time;

    public Flight(Plane plane, String flight, String destination, String departure, String time){
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flight = flight;
        this.destination = destination;
        this.departure = departure;
        this.time = time;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlight() {
        return flight;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public int getPlaneCapacity(){
        return plane.getCapacity();
    }

    public int passengerCount(){
        return this.passengers.size();
    }

    public int emptySeats(){
        return (this.plane.getCapacity() - this.passengerCount());
    }


    public void checkIn(Passenger passenger) {
        if(emptySeats() > 0){
            this.passengers.add(passenger);
        }
    }
}
