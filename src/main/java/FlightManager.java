public class FlightManager {

    private Plane plane;
    private Flight flight;
    private Passenger passenger;

    //Assuming each bag is 10kg


    public int passengerLuggageWeightPerPerson(){
        int weightPerPerson = plane.getCargo() / plane.getCapacity();
        return weightPerPerson;
    }

    public int passengerLuggageWeight(){
        return passenger.getNumBags() * 10;
    }
}
