import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class FlightTest {

    private Plane plane;
    private Passenger passenger;
    private Flight flight;

    @Before
    public void setUp(){
        passenger = new Passenger("Dave", 2);
        flight = new Flight(Plane.BOEING747, "IT747", "FCO", "GLA", "11:00");
    }

    @Test
    public void canGetFlightDetails(){
        //Given we have a flight
        //When a flight is scheduled
        assertNotNull(flight);
        //Then the flight will have a flight number
        assertEquals("IT747", flight.getFlight());
        //AND a destination
        assertEquals("FCO", flight.getDestination());
        //AND a departure location
        assertEquals("GLA", flight.getDeparture());
    }

    @Test
    public void canGetPlaneDetails(){
        //Given we have a flight
        assertNotNull(flight);
        //When the flight is scheduled
        //Then a plane is assigned to the route
        assertEquals(plane.BOEING747, flight.getPlane());
        //AND has a seating capacity
        assertEquals(410, flight.getPlaneCapacity());
    }

    @Test
    public void canBookPassengerOnFlight(){
        //Given we have a flight
        assertNotNull(flight);
        //AND we have a passenger
        assertNotNull(passenger);
        //When a passenger is checked in to the flight
        flight.checkIn(passenger);
        //Then the passenger count increased by 1
        assertEquals(1, flight.passengerCount());
    }


}
