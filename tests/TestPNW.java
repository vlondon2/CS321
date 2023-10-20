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

    /**
     * This test checks the return value of the validation function.
     * Fails if function returns
     */
    @Test
    public void testValidateEntryCorrectData() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(5);
        petition.setDobDay(16);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertTrue(result);
    }

    @Test
    public void testValidateEntryDayOutOfRangeNonLeapYear() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(2);
        petition.setDobDay(29);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testValidateEntryDayInRangeLeapYear() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(2);
        petition.setDobDay(29);
        petition.setDobYear(2004);

        boolean result = pnw.validateEntry(petition);

        assertTrue(result);
    }

    @Test
    public void testValidateEntryMissingName() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(5);
        petition.setDobDay(16);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testValidateEntryMonthOutOfRange() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(13);
        petition.setDobDay(16);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testAddToWorkflowReturnResult() {
        boolean result = pnw.addToWorkflow(petition);

        assertTrue(result);
    }
}
