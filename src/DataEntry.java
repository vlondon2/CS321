package src;

/**
 * The DataEntry class is responsible for checking the database for existing workers and entering petition data for
 * new non-immigrant workers.
 *
 * @author Scott Roszel
 */
public class DataEntry {
    private Petition newPetition;
    private PNW pnw;

    /**
     * Default constructor
     */
    public DataEntry() {
        newPetition = new Petition();
    }

    /**
     * Constructor that accepts a PNW business object
     *
     * @param pnw holds the main business object
     */
    public DataEntry(PNW pnw) {
        this.pnw = pnw;
        System.out.println("Created DataEntry");
    }

    /**
     * The function stores the petitioner first name from the entry field
     * into the petition object.
     */
    private void createNewPetition() {
        this.newPetition = new Petition();
    }

    /**
     * The function stores the petitioner first name from the entry field
     * into the petition object.
     *
     * @param firstName Holds the petitioner first name
     */
    private void setPetitionerFirstName(String firstName) {
        newPetition.setPetitionerFirstName(firstName);
    }

    /**
     * The function stores the petitioner last name from the entry field
     * into the petition object.
     *
     * @param lastName Holds the petitioner last name
     */
    private void setPetitionerLastName(String lastName) {
        newPetition.setPetitionerLastName(lastName);
    }

    /**
     * The function stores the A-Number from the entry field
     * into the petition object.
     *
     * @param aNumber Holds the A-Number
     */
    private void setANumber(String aNumber) {
        newPetition.setANumber(aNumber);
    }

    /**
     * The function stores the beneficiary first name from the entry field
     * into the petition object.
     *
     * @param firstName Holds the beneficiary first name
     */
    private void setBeneficiaryFirstName(String firstName) {
        newPetition.setBeneficiaryFirstName(firstName);
    }

    /**
     * The function stores the beneficiary last name from the entry field
     * into the petition object.
     *
     * @param lastName Holds the beneficiary last name
     */
    private void setBeneficiaryLastName(String lastName) {
        newPetition.setBeneficiaryLastName(lastName);
    }

    /**
     * The function stores the DOB year from the entry field
     * into the petition object.
     *
     * @param year Holds the DOB year
     */
    private void setDobYear(int year) {
        newPetition.setDobYear(year);
    }

    /**
     * The function stores the DOB month from the entry field
     * into the petition object.
     *
     * @param month Holds the DOB month
     */
    private void setDobMonth(int month) {
        newPetition.setDobMonth(month);
    }

    /**
     * The function stores the DOB day from the entry field
     * into the petition object.
     *
     * @param day holds the DOB day
     */
    private void setDobDay(int day) {
        newPetition.setDobDay(day);
    }

    /**
     * The function checks if A-Number already exists
     *
     * @param aNumber holds the A-Number
     * @return true if A-Number exists, false if not found
     */
    private boolean checkStatus(String aNumber) {
        return pnw.checkDatabase(aNumber);
    }

    /**
     * The function attempts to validate the petition data
     *
     * @param petition Holds the petition to validate
     * @return returns the results of the validation
     */
    private boolean submitPetition(Petition petition) {
        return pnw.validateEntry(petition);
    }

    /**
     *  This function clears the screen
     */
    private void clearScreen() {

    }
}
