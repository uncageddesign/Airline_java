public class FlightManager {

    private Plane plane;
    private Flight flight;
    private Passenger passenger;

    //Assuming each bag is 10kg


    public int passengerLuggageWeight(){
        int weightPerPerson = plane.getCargo() / plane.getCapacity();
        return weightPerPerson;
    }
}
