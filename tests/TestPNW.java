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
     * This test checks the return value for ValidateEntry()
     * if the data entered in correct.
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

    /**
     * This test checks the return value for ValidateEntry()
     * if the 29th of February is out of range for a non leap year.
     */
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

    /**
     * This test checks the return value for ValidateEntry()
     * if the 29th in February is in range for a leap year.
     */
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

    /**
     * This test checks the return value for ValidateEntry()
     * if a string entry is empty.
     */
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

    /**
     * This test checks the return value for ValidateEntry()
     * if the month is out of range.
     */
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
    public void testValidateEntryDayOutOfRangeOddMonth() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(11);
        petition.setDobDay(40);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);

    }

    @Test
    public void testValidateEntryDayOutOfRangeEvenMonth() {
        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(10);
        petition.setDobDay(40);
        petition.setDobYear(1989);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testValidateEntryYearTooLarge() {

        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(11);
        petition.setDobDay(23);
        petition.setDobYear(10000);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testValidateEntryYearTooSmall() {

        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(11);
        petition.setDobDay(23);
        petition.setDobYear(0);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @Test
    public void testValidateEntryYearIsNegative() {

        petition = new Petition();

        petition.setBeneficiaryFirstName("John");
        petition.setBeneficiaryLastName("Doe");
        petition.setANumber("001");
        petition.setPetitionerFirstName("Jane");
        petition.setPetitionerLastName("Doe");
        petition.setDobMonth(11);
        petition.setDobDay(23);
        petition.setDobYear(-1800);

        boolean result = pnw.validateEntry(petition);

        assertFalse(result);
    }

    @



    @Test
    public void testAddToWorkflowReturnResult() {
        boolean result = pnw.addToWorkflow(petition);

        assertTrue(result);
    }
}
