public class Plane {

    private PlaneType type;
    private int seats;
    private int weight;

    public Plane(PlaneType type, int seats, int weight) {

        this.type = type;
        this.seats = seats;
        this.weight = weight;

    }

    public PlaneType getType() {
        return this.type;
    }

    public int getSeats(){
        return this.seats;
    }

    public int getWeight(){
        return this.weight;
    }


}
