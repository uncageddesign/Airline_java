public class Passenger {

    private String name;
    private int numBags;
    private String seatNumber;
    private String flight;

    public Passenger(String name, int numBags){
        this.name = name;
        this.numBags = numBags;
        this.seatNumber = null;
        this.flight = null;
    }

    public String getName() {
        return name;
    }

    public int getNumBags() {
        return numBags;
    }
}
