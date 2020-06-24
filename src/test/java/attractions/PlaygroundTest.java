package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor youngVisitor;
    Visitor teenager;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        youngVisitor = new Visitor(12, 180, 20);
        teenager = new Visitor(16, 250, 50);
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
    public void hasMaxAge15__guestsAgedLessThanMaxCanUse(){
        assertTrue(playground.isAllowed(youngVisitor));
    }

    @Test
    public void hasMaxAge15__guestsAgedMoreThanMaxCannotUse(){
        assertFalse(playground.isAllowed(teenager));
    }
}
