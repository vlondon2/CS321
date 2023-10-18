package src;

public class Approval {

    private Petition petition;

    public Approval() {
        petition = new Petition();
    }

    public void getNextFromWorkflow(Petition petition) {
        this.petition = petition;
    }

    public void approve() {
        // Approval logic
    }

    public void reject() {
        // Rejection logic
    }

    private boolean sendEmail() {
        // Email sending logic
    }
}