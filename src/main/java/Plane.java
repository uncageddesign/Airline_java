public enum Plane {
    AIRBUSA333(250, 5000),
    AIRBUSS340(370, 7400),
    BOEING747(410, 8200),
    BOEING777(396, 7920);

    private final int capacity;
    private final int cargo;

   Plane(int capacity, int cargo ){

       this.capacity = capacity;
       this.cargo = cargo;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCargo() {
        return cargo;
    }
}
