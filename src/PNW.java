package src;

public class PNW {

    private final Petition newPetition;
    private final Workflow workflow;
    private int validateReturn;

    public PNW() {
        this.newPetition = new Petition();
        this.workflow = new Workflow();
    }
    
    public int validateEntry() {
        validateReturn = 1;

        if (isEmptyOrNull(newPetition.getPetitionerFirstName())
                || isEmptyOrNull(newPetition.getPetitionerLastName())
                || isEmptyOrNull(newPetition.getaNumber())
                || isEmptyOrNull(newPetition.getBeneficiaryFirstName())
                || isEmptyOrNull(newPetition.getBeneficiaryLastName())
                || isDobInRange(newPetition.getDobYear(), newPetition.getDobMonth(), newPetition.getDobDay())) {

            validateReturn = 0;
        }

        return validateReturn;
    }

    public int addToWorkflow() {
        if (validateReturn == 1) {
            //workflow.addToApprovalQueue();
            return 1;
        }

        return 0;
    }

    private boolean isEmptyOrNull(String string) {
        return string == null || string.isEmpty();
    }

    private boolean isDobInRange(int year, int month, int day) {
        if (year < 1920 || year > 2007 || month < 0 || month > 12) {
            return false;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

            return day >= 0 && day <= 31;

        } else if (month == 2) {

            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

                return day >= 0 && day <= 29;
            }
            else {
                return day >= 0 && day <= 28;
            }
        }
        else {
            return day >= 0 && day <= 30;
        }
    }
}
