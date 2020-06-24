package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor youngVisitor;
    Visitor youngAdult;
    Visitor adult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }
    youngVisitor = new Visitor(12, 140, 10);
    youngAdult = new Visitor(18, 145, 30);
    adult = new Visitor(28, 175, 90);

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
    public void hasHeightRestriction145__visitorsLessThanRestrictionCannotRide(){
        assertFalse(rollerCoaster.isAllowed(youngVisitor));
    }

    @Test
    public void hasHeightRestriction145__visitorsExactly145CannotRide(){
        assertFalse(rollerCoaster.isAllowed(youngAdult));
    }

    @Test
    public void hasHeightRestriction145__visitorsGreaterThanRestrictionCanRide(){
        assertTrue(rollerCoaster.isAllowed(adult));
    }

}
