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
        int result = pnw.validateEntry();

        assertEquals(1, result);
    }

    @Test
    public void testAddToWorkflow() {
        int result = pnw.addToWorkflow();

        assertEquals(1, result);
    }
}
