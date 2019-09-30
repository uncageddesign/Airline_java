import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private Plane plane;
    private Passenger passenger;
    private Flight flight;

    @Before
    public void setUp(){
        passenger = new Passenger("Dave", 2);
        flight = new Flight(Plane.BOEING747, "IT747", "FCO", "GLA", "11:00");
    }

//    @Test
//    public void canGetLuggageWeightPerPerson(){
//        //Given the plane has a max capacity
//        assertEquals(410, Plane.BOEING747.getCapacity());
//        //AND the luggage is a consistent weight
//        //When individual luggage allowance is calculate
//        //Then the weight is returned
//        assertEquals(20, flightManager.passengerLuggageWeightPerPerson());
//    }

    @Test
    public void passengerLuggageWeight(){
        //Given a passenger is booked on a flight
        flight.checkIn(passenger);
        //When the passenger is checked in with luggage
        //Then the passenger has a weight of checked in luggage
        assertEquals(20, flightManager.passengerLuggageWeight());
    }
}
