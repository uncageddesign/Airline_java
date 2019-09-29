import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;


    @Before
    public void setUp(){

        passenger1 = new Passenger("Dave", 2);
        passenger2 = new Passenger("Taylor", 1);
    }

    @Test
    public void passengerHasName(){
        //Given we have a passenger
        //When checked in
        //Then the passenger has a name
        assertEquals("Dave", passenger1.getName());
    }

    @Test
    public void passengerHasBags(){
        //Given we have a passenger
        //When checked in
        //Then the passenger has bags
        assertEquals(2, passenger1.getNumBags());
    }
}
