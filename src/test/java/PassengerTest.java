import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Plane plane;

    @Before
    public void before() {

        passenger = new Passenger("Tino", 2);

    }

    @Test
    public void canGetName() {
        assertEquals("Tino", passenger.getName());
    }

    @Test
    public void getNumBags() {
        assertEquals(2, passenger.getNumBags());
    }


}
