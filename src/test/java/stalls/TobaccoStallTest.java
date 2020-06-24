package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor youngVisitor;
    Visitor youngAdult;
    Visitor adult;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        youngVisitor = new Visitor(12, 140, 10);
        youngAdult = new Visitor(18, 150, 30);
        adult = new Visitor(28, 175, 90);
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
    public void hasMinAge18__youngerVisitorsCannotAccess(){
        assertFalse(tobaccoStall.isAllowed(youngVisitor));
    }

    @Test
    public void hasMinAge18__18YearOldCanAccess(){
        assertTrue(tobaccoStall.isAllowed(youngAdult));
    }

    @Test
    public void hasMinAge18__Over18YearOldCanAccess(){
        assertTrue(tobaccoStall.isAllowed(adult));
    }


}
