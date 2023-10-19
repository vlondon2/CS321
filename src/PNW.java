package src;

import java.util.*;

public class PNW {

    //private final Petition newPetition;
    private final Workflow workflow;
    private Database database;
    private ArrayList<Petition> list;
    private boolean validateReturn;

    /**
     * Default constructor
     */
    public PNW() {
        //this.newPetition = new Petition();
        this.workflow = new Workflow();
        this.database = new Database();
        this.list = database.getDatabase();
    }

    /**
     * This function checks to see if the A-Number already
     * exists in the database.
     *
     * @param aNumber holds the A-Number to check
     * @return true if found, false if not found
     */
    public boolean checkDatabase(String aNumber) {
        for (Petition petition:
                list) {
            if (petition.getaNumber().equals(aNumber)) {
                return true;
            }
        }
        return false;
    }

    /**
     * This function validates that the entries are not null or empty
     * and the month, day and year are within acceptable range.
     *
     * @param petition holds the petition that needs validated
     * @return returns true if petition passes validation
     */
    public boolean validateEntry(Petition petition) {

        validateReturn = isNotEmptyOrNull(petition.getPetitionerFirstName())
                && isNotEmptyOrNull(petition.getPetitionerLastName())
                && isNotEmptyOrNull(petition.getaNumber())
                && isNotEmptyOrNull(petition.getBeneficiaryFirstName())
                && isNotEmptyOrNull(petition.getBeneficiaryLastName())
                && !isDobInRange(petition.getDobYear(), petition.getDobMonth(), petition.getDobDay());

        if (validateReturn) {
            database.addToDatabase(petition);
            addToWorkflow(petition);
        }

        return validateReturn;
    }

    /**
     * This function gets a petition with matching A-Number from thew database
     *
     * @param aNumber A-Number to find entry
     * @return returns the petition with matching A-Number
     */
    public Petition getPetitionFromDatabase(String aNumber) {
        for (Petition petition:
                list) {
            if (petition.getaNumber().equals(aNumber)) {
                return petition;
            }
        }
        return null;
    }

    /**
     * This function adds the petition A-Number to the appropriate queue
     *
     * @param petition petition to add to workflow
     * @return returns true if added successfully
     */
    public boolean addToWorkflow(Petition petition) {
        if (validateReturn) {
            if (petition.getWorkflowStatus() == 0) {
                workflow.addToReviewQueue(petition.getaNumber());
                return true;
            } else if (petition.getWorkflowStatus() == 1) {
                workflow.addToApprovalQueue(petition.getaNumber());
                return true;
            }
        }

        return false;
    }

    /**
     * This function checks if a string data field is empty or null
     *
     * @param string string to check
     * @return returns true if not null or empty
     */
    private boolean isNotEmptyOrNull(String string) {
        return string != null && !string.isEmpty();
    }

    /**
     * This function checks if the entered date is within range
     * based on the provided year and month
     *
     * @param year holds year value
     * @param month holds month value
     * @param day holds day value
     * @return returns true if year, month and day are within range
     */
    private boolean isDobInRange(int year, int month, int day) {
        if (year < 1920 || year > 2007 || month < 0 || month > 12) {
            return false;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return day > 0 && day <= 31;

        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                return day > 0 && day <= 29;
            }
            else {
                return day > 0 && day <= 28;
            }
        }
        else {
            return day > 0 && day <= 30;
        }
    }

    public static void main(String[] args) {
        PNW pnwBusinessObject = new PNW();

        DataEntry dataEntryScreen = new DataEntry(pnwBusinessObject);
    }
}
