package src;

import java.util.*;

public class PNW {

    //private final Petition newPetition;
    private final Workflow workflow;
    private Database database;
    private ArrayList<Petition> list;
    private boolean validateReturn;

    public PNW() {
        //this.newPetition = new Petition();
        this.workflow = new Workflow();
        this.database = new Database();
        this.list = database.getDatabase();
    }

    public boolean checkDatabase(String aNumber) {
        for (Petition petition:
                list) {
            if (petition.getaNumber().equals(aNumber)) {
                return true;
            }
        }
        return false;
    }

    public boolean validateEntry(Petition petition) {

        validateReturn = isNotEmptyOrNull(petition.getPetitionerFirstName())
                && isNotEmptyOrNull(petition.getPetitionerLastName())
                && isNotEmptyOrNull(petition.getaNumber())
                && isNotEmptyOrNull(petition.getBeneficiaryFirstName())
                && isNotEmptyOrNull(petition.getBeneficiaryLastName())
                && !isDobInRange(petition.getDobYear(), petition.getDobMonth(), petition.getDobDay());

        if (validateReturn) {
            database.addToDatabase(petition);
        }

        return validateReturn;
    }

    public Petition getPetitionFromDatabase(String aNumber) {
        for (Petition petition:
                list) {
            if (petition.getaNumber().equals(aNumber)) {
                return petition;
            }
        }
        return null;
    }

    public boolean addToWorkflow() {
        if (validateReturn) {
            //workflow.addToApprovalQueue(newPetition);
            return true;
        }

        return false;
    }

    private boolean isNotEmptyOrNull(String string) {
        return string != null && !string.isEmpty();
    }

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
}
