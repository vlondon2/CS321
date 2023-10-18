package src;

public class PNW {

    private final Petition newPetition;
    private final Workflow workflow;
    private boolean validateReturn;

    public PNW() {
        this.newPetition = new Petition();
        this.workflow = new Workflow();
    }

    public boolean validateEntry() {

        validateReturn = isNotEmptyOrNull(newPetition.getPetitionerFirstName())
                && isNotEmptyOrNull(newPetition.getPetitionerLastName())
                && isNotEmptyOrNull(newPetition.getaNumber())
                && isNotEmptyOrNull(newPetition.getBeneficiaryFirstName())
                && isNotEmptyOrNull(newPetition.getBeneficiaryLastName())
                && !isDobInRange(newPetition.getDobYear(), newPetition.getDobMonth(), newPetition.getDobDay());

        return validateReturn;
    }

    public boolean addToWorkflow() {
        if (validateReturn) {
            //workflow.addToApprovalQueue();
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
