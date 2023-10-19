package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import src.PNW;
import src.Petition;

public class TestPNW {
    PNW pnw;

    @Before
    public void create() {
        pnw = new PNW();
    }

    @Test
    public void testValidateEntry() {
        Petition petition = new Petition();
        boolean result = pnw.validateEntry(petition);

        assertTrue(result);
    }

    @Test
    public void testAddToWorkflow() {
        boolean result = pnw.addToWorkflow();

        assertTrue(result);
    }
}
