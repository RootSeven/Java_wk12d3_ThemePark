package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor smallChild;
    Visitor tallAdult;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        smallChild = new Visitor(9, 90, 10.00);
        tallAdult = new Visitor(21, 230, 10.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void defaultPrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void childrenHalfPrice(){
        assertEquals(2.25, dodgems.priceFor(smallChild), 0.01);
    }

    @Test
    public void adultsNotHalfPrice(){
        assertEquals(4.50, dodgems.priceFor(tallAdult), 0.01);
    }
}
