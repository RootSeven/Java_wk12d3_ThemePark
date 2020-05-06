package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor adultVisitor;
    Visitor childVisitor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        adultVisitor = new Visitor(18, 150, 10.00);
        childVisitor = new Visitor(13, 130, 10.00);

    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void entryForAdults(){
        assertEquals(true, tobaccoStall.isAllowedTo(adultVisitor));
    }

    @Test
    public void noEntryForChildren(){
        assertEquals(false, tobaccoStall.isAllowedTo(childVisitor));
    }
}
