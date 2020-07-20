import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Passenger passenger;

    @Before
    public void Before() {

        passenger = new Passenger("Tino", 2);
        flight = new Flight(PlaneType.GYROCOPTER, 12345, "Cairo", "Glasgow", "1300");
    }

    @Test
    public void canGetBooked(){
        assertEquals(0, flight.getBookedSeats());
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.GYROCOPTER, flight.getPlaneType());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals(12345, flight.getFlightNumber());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Cairo", flight.getDestination());
    }

    @Test
    public void canGetDepartsFrom(){
        assertEquals("Glasgow", flight.getDepartsFrom());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("1300", flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger(){
        assertEquals("Tino", flight.addPassenger(passenger));
    }
}
