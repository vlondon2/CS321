package src;

public class PNW {

    private Petition newPetition;
    private Workflow workflow;
    private int validateReturn;

    public PNW() {
        this.newPetition = new Petition();
        this.workflow = new Workflow();
    }
    
    public int validateEntry() {
        if (newPetition.getaNumber() == "")
        {
            return 0;
        }

        if (newPetition.getLastName() == "") {
            return 0;
        }

        if (newPetition.getFirstName() == "") {
            return 0;
        }

        validateReturn = 1;
        return 1;
    }

    public int addToWorkflow() {
        if (validateReturn == 1) {
            workflow.addToApprovalQueue();
            return 1;
        }

        return 0;
    }
}
