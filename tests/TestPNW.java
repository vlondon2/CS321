package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import src.PNW;

public class TestPNW {
    PNW pnw;

    @Before
    public void create() {
        pnw = new PNW();
    }

    @Test
    public void testValidateEntry() {
        boolean result = pnw.validateEntry();

        assertTrue(result);
    }

    @Test
    public void testAddToWorkflow() {
        boolean result = pnw.addToWorkflow();

        assertTrue(result);
    }
}
