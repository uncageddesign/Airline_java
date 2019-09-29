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



}
