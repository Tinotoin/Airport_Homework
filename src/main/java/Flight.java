import java.util.ArrayList;

public class Flight {

    public ArrayList<Passenger> booked;
    private PlaneType PlaneType;
    private int flightNumber;
    private String destination;
    private String departsFrom;
    private String departureTime;
    private int planeWeight;

    public Flight(PlaneType PlaneType, int flightNumber, String destination, String departsFrom, String departureTime) {
        this.booked = new ArrayList<Passenger>();
        this.PlaneType = PlaneType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departsFrom = departsFrom;
        this.departureTime = departureTime;
        this.planeWeight = planeWeight;
    }

    public int getBookedSeats() {
        return this.booked.size();
    }

    public PlaneType getPlaneType() {
        return this.PlaneType;
    }

    public int getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartsFrom() {
        return this.departsFrom;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }


    public ArrayList<Passenger> addPassenger(Passenger passenger) {
//        if (plane.getWeight <= plane.weight / 2) { // hmmmm.....
        this.booked.add(passenger);
//        }else{
//            System.out.println("Sorry, we're too heavy!");
        return this.booked;
    }
}
