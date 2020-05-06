package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor childVisitor;
    Visitor adultVisitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        childVisitor = new Visitor(12, 100, 10.00);
        adultVisitor = new Visitor(16, 150, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void entryToChildren(){
        assertEquals(true, playground.isAllowedTo(childVisitor));
    }

    @Test
    public void noEntryToAdults(){
        assertEquals(false, playground.isAllowedTo(adultVisitor));
    }
}
