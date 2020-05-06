package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor smallChild;
    Visitor tallChild;
    Visitor smallAdult;
    Visitor tallAdult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);

        smallChild = new Visitor(11, 130, 10.00 );
        tallChild = new Visitor(11, 150, 10.00 );
        smallAdult = new Visitor(21, 130, 10.00 );
        tallAdult = new Visitor(21, 210, 10.00 );
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void noEntryForShortChildren() {
        assertEquals(false, rollerCoaster.isAllowedTo(smallChild));
    }

    @Test
    public void noEntryForTallChildren() {
        assertEquals(false, rollerCoaster.isAllowedTo(tallChild));
    }

    @Test
    public void noEntryForSmallAdults() {
        assertEquals(false, rollerCoaster.isAllowedTo(smallAdult));
    }

    @Test
    public void entryForTallAdults() {
        assertEquals(true, rollerCoaster.isAllowedTo(tallAdult));
    }

    @Test
    public void defaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void tallPersonBigotry(){
        assertEquals(16.80, rollerCoaster.priceFor(tallAdult), 0.01);
    }
}
