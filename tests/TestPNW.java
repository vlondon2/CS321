package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import src.PNW;
import src.Petition;

public class TestPNW {
    PNW pnw;
    Petition petition;

    @Before
    public void create() {
        pnw = new PNW();
        petition = new Petition();
    }

    @Test
    public void testValidateEntry() {
        Petition petition = new Petition();
        boolean result = pnw.validateEntry(petition);

        assertTrue(result);
    }

    @Test
    public void testAddToWorkflow() {
        boolean result = pnw.addToWorkflow(petition);

        assertTrue(result);
    }

    @Test
    public void testCheckDatabase() {

    }
}
