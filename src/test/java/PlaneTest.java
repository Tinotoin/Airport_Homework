import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {

        plane = new Plane(PlaneType.GYROCOPTER, 100, 5000);

    }

    @Test
    public void canGetType(){
        assertEquals(PlaneType.GYROCOPTER, plane.getType());
    }

    @Test
    public void canGetSeats() {
        assertEquals(100, plane.getSeats());
    }

    @Test
    public void canGetWeight() {
        assertEquals(5000, plane.getWeight());
    }
}
