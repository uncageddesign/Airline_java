import org.junit.Before;

public class FlightTest {

    private Flight flight;

    @Before
    public void setUp(){
        flight = new Flight(Plane.BOEING747, "IT747", "FCO", "GLA", "11:00");
    }
}
