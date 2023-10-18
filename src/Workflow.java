package src;

import java.util.LinkedList;
import java.util.Queue;

public class Workflow {
    private Queue<Petition> reviewQueue;
    private Queue<Petition> approvalQueue;

    public Workflow() {
        reviewQueue = new LinkedList<>();
        approvalQueue = new LinkedList<>();
    }

    public int addToReviewQueue(Petition petition) {
        //reviewQueue.add(petition);
        return 0;
    }

    public int addToApprovalQueue(Petition petition) {
        //approvalQueue.add(petition);
        return 0;
    }

    public Petition removeFromReviewQueue() {

        //return reviewQueue.remove();
        return null;
    }

    public Petition removeFromApprovalQueue() {

        //return approvalQueue.remove();
        return null;
    }

    public Queue<Petition> getReviewQueue() {
        return reviewQueue;
    }

    public Queue<Petition> getApprovalQueue() {
        return approvalQueue;
    }
}
