package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor youngVisitor1;
    Visitor youngVisitor2;
    Visitor adult;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        youngVisitor1 = new Visitor(13, 140, 10);
        youngVisitor2 = new Visitor(13, 140, 10);
        adult = new Visitor(28, 175, 90);
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

    // Tests for height & age restriction
    // Must be over 145cm tall & over 12 years old

    //Guests who are old enough but not tall enough cannot ride
    @Test
    public void hasHeightAgeRestriction__TooShortButOldEnoughCannotRide(){
        assertFalse(rollerCoaster.isAllowed(youngVisitor1));
    }

    //Guests who are tall enough but not old enough cannot ride
    @Test
    public void hasHeightAgeRestriction__TallEnoughNotOldEnoughCannotRide(){
        assertFalse(rollerCoaster.isAllowed(youngVisitor2));
    }

    //Guests who are old enough and tall enough may ride
    @Test
    public void hasHeightAgeRestriction__OldEnoughTallEnoughCanRide(){
        assertTrue(rollerCoaster.isAllowed(adult));
    }

    @Test
    public void hasHeightRestriction145__visitorsGreaterThanRestrictionCanRide(){
        assertTrue(rollerCoaster.isAllowed(adult));
    }

}
